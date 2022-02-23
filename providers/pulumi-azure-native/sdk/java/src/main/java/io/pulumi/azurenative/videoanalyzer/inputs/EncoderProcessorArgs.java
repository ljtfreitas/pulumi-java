// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.EncoderCustomPresetArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.EncoderSystemPresetArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.NodeInputArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Encoder processor allows for encoding of the input content. For example, it can used to change the resolution from 4K to 1280x720.
 * 
 */
public final class EncoderProcessorArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncoderProcessorArgs Empty = new EncoderProcessorArgs();

    /**
     * An array of upstream node references within the topology to be used as inputs for this node.
     * 
     */
    @InputImport(name="inputs", required=true)
        private final Input<List<NodeInputArgs>> inputs;

    public Input<List<NodeInputArgs>> getInputs() {
        return this.inputs;
    }

    /**
     * Node name. Must be unique within the topology.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The encoder preset, which defines the recipe or instructions on how the input content should be processed.
     * 
     */
    @InputImport(name="preset", required=true)
        private final Input<Either<EncoderCustomPresetArgs,EncoderSystemPresetArgs>> preset;

    public Input<Either<EncoderCustomPresetArgs,EncoderSystemPresetArgs>> getPreset() {
        return this.preset;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EncoderProcessor'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public EncoderProcessorArgs(
        Input<List<NodeInputArgs>> inputs,
        Input<String> name,
        Input<Either<EncoderCustomPresetArgs,EncoderSystemPresetArgs>> preset,
        Input<String> type) {
        this.inputs = Objects.requireNonNull(inputs, "expected parameter 'inputs' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.preset = Objects.requireNonNull(preset, "expected parameter 'preset' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EncoderProcessorArgs() {
        this.inputs = Input.empty();
        this.name = Input.empty();
        this.preset = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncoderProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<NodeInputArgs>> inputs;
        private Input<String> name;
        private Input<Either<EncoderCustomPresetArgs,EncoderSystemPresetArgs>> preset;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncoderProcessorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.name = defaults.name;
    	      this.preset = defaults.preset;
    	      this.type = defaults.type;
        }

        public Builder setInputs(Input<List<NodeInputArgs>> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }

        public Builder setInputs(List<NodeInputArgs> inputs) {
            this.inputs = Input.of(Objects.requireNonNull(inputs));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPreset(Input<Either<EncoderCustomPresetArgs,EncoderSystemPresetArgs>> preset) {
            this.preset = Objects.requireNonNull(preset);
            return this;
        }

        public Builder setPreset(Either<EncoderCustomPresetArgs,EncoderSystemPresetArgs> preset) {
            this.preset = Input.of(Objects.requireNonNull(preset));
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
        public EncoderProcessorArgs build() {
            return new EncoderProcessorArgs(inputs, name, preset, type);
        }
    }
}
