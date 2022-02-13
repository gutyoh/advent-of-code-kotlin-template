package main

import (
	"encoding/csv"
	"fmt"
	"log"
	"os"
	"strconv"
)

type Movie struct {
	Name   string
	Rating int
}

func main() {
	fmt.Println(readMovies())
}

func readMovies() []Movie {
	movies := make([]Movie, 0, 3)

	csvFile, err := os.Open("movies.csv")
	if err != nil {
		log.Fatal(err)
	}

	record, err := csv.NewReader(csvFile).ReadAll()
	if err != nil {
		log.Fatal(err)
	}

	for _, movie := range record {
		rating, err := strconv.Atoi(movie[1])
		if err != nil {
			log.Fatal(err)
		}
		movies = append(movies, Movie{movie[0], rating})
	}
	return movies
}
