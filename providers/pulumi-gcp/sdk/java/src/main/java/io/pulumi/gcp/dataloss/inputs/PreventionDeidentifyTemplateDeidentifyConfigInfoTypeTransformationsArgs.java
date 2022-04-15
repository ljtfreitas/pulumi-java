// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs;
import java.util.List;
import java.util.Objects;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs();

    /**
     * Transformation for each infoType. Cannot specify more than one for a given infoType.
     * Structure is documented below.
     * 
     */
    @Import(name="transformations", required=true)
      private final Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs>> transformations;

    public Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs>> transformations() {
        return this.transformations;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs(Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs>> transformations) {
        this.transformations = Objects.requireNonNull(transformations, "expected parameter 'transformations' to be non-null");
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs() {
        this.transformations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs>> transformations;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformations = defaults.transformations;
        }

        public Builder transformations(Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs>> transformations) {
            this.transformations = Objects.requireNonNull(transformations);
            return this;
        }
        public Builder transformations(List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs> transformations) {
            this.transformations = Output.of(Objects.requireNonNull(transformations));
            return this;
        }
        public Builder transformations(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs... transformations) {
            return transformations(List.of(transformations));
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs(transformations);
        }
    }
}
