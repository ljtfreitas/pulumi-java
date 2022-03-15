// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pipeline reference type.
 * 
 */
public final class PipelineReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineReferenceArgs Empty = new PipelineReferenceArgs();

    /**
     * Reference name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Reference pipeline name.
     * 
     */
    @Import(name="referenceName", required=true)
      private final Output<String> referenceName;

    public Output<String> getReferenceName() {
        return this.referenceName;
    }

    /**
     * Pipeline reference type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public PipelineReferenceArgs(
        @Nullable Output<String> name,
        Output<String> referenceName,
        Output<String> type) {
        this.name = name;
        this.referenceName = Objects.requireNonNull(referenceName, "expected parameter 'referenceName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PipelineReferenceArgs() {
        this.name = Output.empty();
        this.referenceName = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private Output<String> referenceName;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder referenceName(Output<String> referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }

        public Builder referenceName(String referenceName) {
            this.referenceName = Output.of(Objects.requireNonNull(referenceName));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public PipelineReferenceArgs build() {
            return new PipelineReferenceArgs(name, referenceName, type);
        }
    }
}
