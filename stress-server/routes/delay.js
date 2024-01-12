var express = require('express');
var router = express.Router();

/* GET delay listing. */
router.get('/', function(req, res, next) {
    // 5초 지연
    setTimeout(() => {
        res.send('Delayed response');
    }, 5000);
});

module.exports = router;
