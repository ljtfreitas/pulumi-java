// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class SecurityContextResponse {
    /**
     * (Optional) The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    private final Integer runAsUser;

    @OutputCustomType.Constructor({"runAsUser"})
    private SecurityContextResponse(Integer runAsUser) {
        this.runAsUser = Objects.requireNonNull(runAsUser);
    }

    /**
     * (Optional) The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    public Integer getRunAsUser() {
        return this.runAsUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer runAsUser;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.runAsUser = defaults.runAsUser;
        }

        public Builder setRunAsUser(Integer runAsUser) {
            this.runAsUser = Objects.requireNonNull(runAsUser);
            return this;
        }
        public SecurityContextResponse build() {
            return new SecurityContextResponse(runAsUser);
        }
    }
}
