// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetViewArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetViewArgs Empty = new GetViewArgs();

    /**
     * View name
     * 
     */
    @InputImport(name="viewName", required=true)
        private final String viewName;

    public String getViewName() {
        return this.viewName;
    }

    public GetViewArgs(String viewName) {
        this.viewName = Objects.requireNonNull(viewName, "expected parameter 'viewName' to be non-null");
    }

    private GetViewArgs() {
        this.viewName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String viewName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetViewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewName = defaults.viewName;
        }

        public Builder setViewName(String viewName) {
            this.viewName = Objects.requireNonNull(viewName);
            return this;
        }
        public GetViewArgs build() {
            return new GetViewArgs(viewName);
        }
    }
}
