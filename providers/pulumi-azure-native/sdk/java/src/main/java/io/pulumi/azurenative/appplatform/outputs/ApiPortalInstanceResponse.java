// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApiPortalInstanceResponse {
    /**
     * Name of the API portal instance
     * 
     */
    private final String name;
    /**
     * Status of the API portal instance
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"name","status"})
    private ApiPortalInstanceResponse(
        String name,
        String status) {
        this.name = Objects.requireNonNull(name);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Name of the API portal instance
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Status of the API portal instance
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPortalInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPortalInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public ApiPortalInstanceResponse build() {
            return new ApiPortalInstanceResponse(name, status);
        }
    }
}
