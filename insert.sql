INSERT INTO mst_category
(category_name, category_description)
VALUES('リキュール', '');

INSERT INTO mst_category
(category_name, category_description)
VALUES('ワイン', '');

INSERT INTO mst_category
(category_name, category_description)
VALUES('日本酒', '');

INSERT INTO mst_product
(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company)
VALUES('カルーア', 'かるーあ', '古くから続くコーヒーベースのお酒\r\nカ・ルーア17世が初めて飲んだことから名づけられた', '1', '880', '/img/liqueur/kahlua.jpg', '1936/10/03', '株式会社牛乳');

INSERT INTO mst_product
(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company)
VALUES('ペパーミント', 'ぺぱーみんと', 'ミントのさわやかな香りが特徴的なお酒\r\n飲んで損した人はいないと言われている', '1', '2480', '/img/liqueur/peppermint.jpg', '1992/12/19', '小さな葉っぱ株式会社');

INSERT INTO mst_product
(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company)
VALUES('ベルモット', 'べるもっと', '独特の風味のワイン\r\nその独特さから、少年が活躍する探偵漫画にも出演', '2','6780', '/img/wine/vermouth.jpg', '1887/05/04', '株式会社おしゃれ');

INSERT INTO mst_product
(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company)
VALUES('シャンパン', 'しゃんぱん', '新宿でよく売れているお酒　泡といわれることもある\r\n飲むと気分が良くなるが、飲みすぎると気分が悪くなる', '2','9800', '/img/wine/champagne.jpg', '1919/10/02', '株式会社カリスマ');

INSERT INTO mst_product
(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company)
VALUES('初々', 'ういうい', '生まれたての赤ちゃんのような香りの日本酒\r\n赤ちゃんにも手が届くほど安い', '3', '298','/img/sake/uiui.jpg', '2021/03/15', '産まれたて株式会社');

INSERT INTO mst_product
(product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company)
VALUES('果実酒', 'かじつしゅ', 'ざっくりとネーミングされたお酒\r\nそのため、味もざっくりとしている', '3', '1680','/img/sake/fruit_wine.jpg', '1902/08/30', 'ライオン農園');
