package ca.tetervak.flowerdataservice.data.init;

import ca.tetervak.flowerdataservice.data.jpa.Flower;
import ca.tetervak.flowerdataservice.data.jpa.FlowerDataRepository;
import ca.tetervak.flowerdataservice.data.jpa.Picture;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DBInitializer {

    private final FlowerDataRepository flowerDataRepository;

    public DBInitializer(FlowerDataRepository flowerDataRepository) {
        this.flowerDataRepository = flowerDataRepository;
    }

    @PostConstruct
    public void init(){

        Flower aster = new Flower(
                "aster",
                "Asters",
                2.99,
                "The name Aster comes from the Ancient Greek word meaning star, referring to the shape of the flower head.",
                new Picture("aster_small.jpeg", "aster_large.jpeg"),
                "https://en.wikipedia.org/wiki/Aster_(genus)"
        );
        flowerDataRepository.save(aster);

        Flower carnation = new Flower(
                "carnation",
                "Carnations",
                1.99,
                "Carnations require well-drained, neutral to slightly alkaline soil, and full sun. Examples include Gina Porto, Helen and Red Rocket",
                new Picture("carnation_small.jpeg", "carnation_large.jpeg"),
                "https://en.wikipedia.org/wiki/Dianthus_caryophyllus"
        );
        flowerDataRepository.save(carnation);

        Flower daffodil = new Flower(
                "daffodil",
                "Daffodils",
                1.99,
                "Daffodil is a common English name, sometimes used for all varieties, and commonly used by the American Daffodil Society",
                new Picture("daffodil_small.jpeg", "daffodil_large.jpeg"),
                "https://en.wikipedia.org/wiki/Narcissus_(plant)"
        );
        flowerDataRepository.save(daffodil);

        Flower rose = new Flower(
                "rose",
                "Roses",
                4.99,
                "A rose is a woody perennial within the family Rosaceae. They form a group of erect shrubs, and climbing or trailing plants.",
                new Picture("rose_small.jpeg", "rose_large.jpeg"),
                "https://en.wikipedia.org/wiki/Rose"
        );
        flowerDataRepository.save(rose);

        Flower orchid = new Flower(
                "orchid",
                "Orchids",
                10.99,
                "The orchid family is a diverse and widespread family in the order Asparagales. It is one of the largest families of flowering plants.",
                new Picture("orchid_small.jpeg", "orchid_large.jpeg"),
                "https://en.wikipedia.org/wiki/Orchidaceae"
        );
        flowerDataRepository.save(orchid);

        flowerDataRepository.flush();
    }
}
