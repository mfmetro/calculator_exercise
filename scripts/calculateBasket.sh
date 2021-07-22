#!/bin/bash
curl -X POST http://localhost:8080/calculator/calculate-basket \
   -H "Content-Type: application/json" \
   -d "{\"customerId\":\"customer-1\",\"entries\":[{\"articleId\":\"article-1\",\"quantity\":4},{\"articleId\":\"article-2\",\"quantity\":3}]}"

# expected response:
#{
#  "customerId":"customer-1",
#  "pricedBasketEntries":
#  {
#    "article-2":10.2870,
#    "article-1":11.9790
#  },
#  "totalAmount":23.2660
#}