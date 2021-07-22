#!/bin/bash
curl -X POST http://localhost:8080/calculator/calculate-basket \
   -H "Content-Type: application/json" \
   -d "{\"customerId\":\"customer-1\",\"entries\":[{\"articleId\":\"article-1\",\"quantity\":4},{\"articleId\":\"article-2\",\"quantity\":3}]}"