package teamdraco.frozenup.init;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import teamdraco.frozenup.FrozenUp;
import teamdraco.frozenup.world.gen.feature.IceTreeFeature;
import teamdraco.frozenup.world.gen.feature.IcicleFeature;

@SuppressWarnings("unused")
public class FrozenUpFeatures {
    public static final DeferredRegister<Feature<?>> REGISTER = DeferredRegister.create(ForgeRegistries.FEATURES, FrozenUp.MOD_ID);

    public static final Feature<NoFeatureConfig> ICICLE = new IcicleFeature();
    public static final Feature<NoFeatureConfig> ICE_TREE = new IceTreeFeature();

}
