// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Toy {
    private final @Nullable Toy associated;
    private final @Nullable String color;
    private final @Nullable Double wear;

    @OutputCustomType.Constructor({"associated","color","wear"})
    private Toy(
        @Nullable Toy associated,
        @Nullable String color,
        @Nullable Double wear) {
        this.associated = associated;
        this.color = color;
        this.wear = wear;
    }

    public Optional<Toy> getAssociated() {
        return Optional.ofNullable(this.associated);
    }
    public Optional<String> getColor() {
        return Optional.ofNullable(this.color);
    }
    public Optional<Double> getWear() {
        return Optional.ofNullable(this.wear);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Toy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Toy associated;
        private @Nullable String color;
        private @Nullable Double wear;

        public Builder() {
    	      // Empty
        }

        public Builder(Toy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associated = defaults.associated;
    	      this.color = defaults.color;
    	      this.wear = defaults.wear;
        }

        public Builder setAssociated(@Nullable Toy associated) {
            this.associated = associated;
            return this;
        }

        public Builder setColor(@Nullable String color) {
            this.color = color;
            return this;
        }

        public Builder setWear(@Nullable Double wear) {
            this.wear = wear;
            return this;
        }

        public Toy build() {
            return new Toy(associated, color, wear);
        }
    }
}
