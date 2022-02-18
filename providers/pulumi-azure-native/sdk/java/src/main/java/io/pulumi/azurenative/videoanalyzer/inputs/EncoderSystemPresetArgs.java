// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.enums.EncoderSystemPresetType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a built-in preset for encoding the input content using the encoder processor.
 * 
 */
public final class EncoderSystemPresetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncoderSystemPresetArgs Empty = new EncoderSystemPresetArgs();

    /**
     * Name of the built-in encoding preset.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<Either<String,EncoderSystemPresetType>> name;

    public Input<Either<String,EncoderSystemPresetType>> getName() {
        return this.name;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EncoderSystemPreset'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public EncoderSystemPresetArgs(
        Input<Either<String,EncoderSystemPresetType>> name,
        Input<String> type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EncoderSystemPresetArgs() {
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncoderSystemPresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,EncoderSystemPresetType>> name;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncoderSystemPresetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(Input<Either<String,EncoderSystemPresetType>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(Either<String,EncoderSystemPresetType> name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public EncoderSystemPresetArgs build() {
            return new EncoderSystemPresetArgs(name, type);
        }
    }
}
