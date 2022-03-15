// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.diagflow.inputs.CxPageFormParameterGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageFormGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageFormGetArgs Empty = new CxPageFormGetArgs();

    /**
     * Parameters to collect from the user.
     * Structure is documented below.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<CxPageFormParameterGetArgs>> parameters;

    public Output<List<CxPageFormParameterGetArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    public CxPageFormGetArgs(@Nullable Output<List<CxPageFormParameterGetArgs>> parameters) {
        this.parameters = parameters;
    }

    private CxPageFormGetArgs() {
        this.parameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CxPageFormParameterGetArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
        }

        public Builder parameters(@Nullable Output<List<CxPageFormParameterGetArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<CxPageFormParameterGetArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public CxPageFormGetArgs build() {
            return new CxPageFormGetArgs(parameters);
        }
    }
}
