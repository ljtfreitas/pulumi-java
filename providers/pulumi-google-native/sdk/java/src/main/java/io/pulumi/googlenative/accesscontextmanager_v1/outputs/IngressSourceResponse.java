// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IngressSourceResponse {
    /**
     * An AccessLevel resource name that allow resources within the ServicePerimeters to be accessed from the internet. AccessLevels listed must be in the same policy as this ServicePerimeter. Referencing a nonexistent AccessLevel will cause an error. If no AccessLevel names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL`. If a single `*` is specified for `access_level`, then all IngressSources will be allowed.
     * 
     */
    private final String accessLevel;
    /**
     * A Google Cloud resource that is allowed to ingress the perimeter. Requests from these resources will be allowed to access perimeter data. Currently only projects are allowed. Format: `projects/{project_number}` The project may be in any Google Cloud organization, not just the organization that the perimeter is defined in. `*` is not allowed, the case of allowing all Google Cloud resources only is not supported.
     * 
     */
    private final String resource;

    @OutputCustomType.Constructor({"accessLevel","resource"})
    private IngressSourceResponse(
        String accessLevel,
        String resource) {
        this.accessLevel = Objects.requireNonNull(accessLevel);
        this.resource = Objects.requireNonNull(resource);
    }

    /**
     * An AccessLevel resource name that allow resources within the ServicePerimeters to be accessed from the internet. AccessLevels listed must be in the same policy as this ServicePerimeter. Referencing a nonexistent AccessLevel will cause an error. If no AccessLevel names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL`. If a single `*` is specified for `access_level`, then all IngressSources will be allowed.
     * 
     */
    public String getAccessLevel() {
        return this.accessLevel;
    }
    /**
     * A Google Cloud resource that is allowed to ingress the perimeter. Requests from these resources will be allowed to access perimeter data. Currently only projects are allowed. Format: `projects/{project_number}` The project may be in any Google Cloud organization, not just the organization that the perimeter is defined in. `*` is not allowed, the case of allowing all Google Cloud resources only is not supported.
     * 
     */
    public String getResource() {
        return this.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessLevel;
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.resource = defaults.resource;
        }

        public Builder setAccessLevel(String accessLevel) {
            this.accessLevel = Objects.requireNonNull(accessLevel);
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public IngressSourceResponse build() {
            return new IngressSourceResponse(accessLevel, resource);
        }
    }
}
