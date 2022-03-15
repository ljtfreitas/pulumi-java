// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetParameterGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetParameterGroupArgs Empty = new GetParameterGroupArgs();

    /**
     * The name of the parameter group.
     * 
     */
    @Import(name="parameterGroupName", required=true)
      private final String parameterGroupName;

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    public GetParameterGroupArgs(String parameterGroupName) {
        this.parameterGroupName = Objects.requireNonNull(parameterGroupName, "expected parameter 'parameterGroupName' to be non-null");
    }

    private GetParameterGroupArgs() {
        this.parameterGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetParameterGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetParameterGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterGroupName = defaults.parameterGroupName;
        }

        public Builder parameterGroupName(String parameterGroupName) {
            this.parameterGroupName = Objects.requireNonNull(parameterGroupName);
            return this;
        }
        public GetParameterGroupArgs build() {
            return new GetParameterGroupArgs(parameterGroupName);
        }
    }
}
