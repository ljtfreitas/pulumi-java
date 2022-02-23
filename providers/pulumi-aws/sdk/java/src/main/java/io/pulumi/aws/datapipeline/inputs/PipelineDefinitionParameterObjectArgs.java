// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectAttributeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineDefinitionParameterObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDefinitionParameterObjectArgs Empty = new PipelineDefinitionParameterObjectArgs();

    @InputImport(name="attributes")
    private final @Nullable Input<List<PipelineDefinitionParameterObjectAttributeArgs>> attributes;

    public Input<List<PipelineDefinitionParameterObjectAttributeArgs>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * ID of the parameter value.
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    public PipelineDefinitionParameterObjectArgs(
        @Nullable Input<List<PipelineDefinitionParameterObjectAttributeArgs>> attributes,
        Input<String> id) {
        this.attributes = attributes;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private PipelineDefinitionParameterObjectArgs() {
        this.attributes = Input.empty();
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionParameterObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PipelineDefinitionParameterObjectAttributeArgs>> attributes;
        private Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionParameterObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.id = defaults.id;
        }

        public Builder setAttributes(@Nullable Input<List<PipelineDefinitionParameterObjectAttributeArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable List<PipelineDefinitionParameterObjectAttributeArgs> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }
        public PipelineDefinitionParameterObjectArgs build() {
            return new PipelineDefinitionParameterObjectArgs(attributes, id);
        }
    }
}