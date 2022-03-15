// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.azurenative.digitaltwins.enums.DigitalTwinsIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The managed identity for the DigitalTwinsInstance.
 * 
 */
public final class DigitalTwinsIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final DigitalTwinsIdentityArgs Empty = new DigitalTwinsIdentityArgs();

    /**
     * The type of Managed Identity used by the DigitalTwinsInstance. Only SystemAssigned is supported.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,DigitalTwinsIdentityType>> type;

    public Output<Either<String,DigitalTwinsIdentityType>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public DigitalTwinsIdentityArgs(@Nullable Output<Either<String,DigitalTwinsIdentityType>> type) {
        this.type = type;
    }

    private DigitalTwinsIdentityArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DigitalTwinsIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,DigitalTwinsIdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DigitalTwinsIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<Either<String,DigitalTwinsIdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable Either<String,DigitalTwinsIdentityType> type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public DigitalTwinsIdentityArgs build() {
            return new DigitalTwinsIdentityArgs(type);
        }
    }
}
