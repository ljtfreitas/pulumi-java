// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.plant.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.plant.enums.ContainerBrightness;
import io.pulumi.plant.enums.ContainerSize;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Container {
    private final @Nullable ContainerBrightness brightness;
    private final @Nullable String color;
    private final @Nullable String material;
    private final ContainerSize size;

    @CustomType.Constructor
    private Container(
        @CustomType.Parameter("brightness") @Nullable ContainerBrightness brightness,
        @CustomType.Parameter("color") @Nullable String color,
        @CustomType.Parameter("material") @Nullable String material,
        @CustomType.Parameter("size") ContainerSize size) {
        this.brightness = brightness;
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public Optional<ContainerBrightness> getBrightness() {
        return Optional.ofNullable(this.brightness);
    }
    public Optional<String> getColor() {
        return Optional.ofNullable(this.color);
    }
    public Optional<String> getMaterial() {
        return Optional.ofNullable(this.material);
    }
    public ContainerSize getSize() {
        return this.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Container defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerBrightness brightness;
        private @Nullable String color;
        private @Nullable String material;
        private ContainerSize size;

        public Builder() {
    	      // Empty
        }

        public Builder(Container defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brightness = defaults.brightness;
    	      this.color = defaults.color;
    	      this.material = defaults.material;
    	      this.size = defaults.size;
        }

        public Builder brightness(@Nullable ContainerBrightness brightness) {
            this.brightness = brightness;
            return this;
        }

        public Builder color(@Nullable String color) {
            this.color = color;
            return this;
        }

        public Builder material(@Nullable String material) {
            this.material = material;
            return this;
        }

        public Builder size(ContainerSize size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Container build() {
            return new Container(brightness, color, material, size);
        }
    }
}
