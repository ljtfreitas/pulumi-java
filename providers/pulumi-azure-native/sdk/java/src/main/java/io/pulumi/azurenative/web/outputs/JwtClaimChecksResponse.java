// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class JwtClaimChecksResponse {
    /**
     * The list of the allowed client applications.
     * 
     */
    private final @Nullable List<String> allowedClientApplications;
    /**
     * The list of the allowed groups.
     * 
     */
    private final @Nullable List<String> allowedGroups;

    @OutputCustomType.Constructor({"allowedClientApplications","allowedGroups"})
    private JwtClaimChecksResponse(
        @Nullable List<String> allowedClientApplications,
        @Nullable List<String> allowedGroups) {
        this.allowedClientApplications = allowedClientApplications;
        this.allowedGroups = allowedGroups;
    }

    /**
     * The list of the allowed client applications.
     * 
     */
    public List<String> getAllowedClientApplications() {
        return this.allowedClientApplications == null ? List.of() : this.allowedClientApplications;
    }
    /**
     * The list of the allowed groups.
     * 
     */
    public List<String> getAllowedGroups() {
        return this.allowedGroups == null ? List.of() : this.allowedGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtClaimChecksResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedClientApplications;
        private @Nullable List<String> allowedGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtClaimChecksResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedClientApplications = defaults.allowedClientApplications;
    	      this.allowedGroups = defaults.allowedGroups;
        }

        public Builder setAllowedClientApplications(@Nullable List<String> allowedClientApplications) {
            this.allowedClientApplications = allowedClientApplications;
            return this;
        }

        public Builder setAllowedGroups(@Nullable List<String> allowedGroups) {
            this.allowedGroups = allowedGroups;
            return this;
        }

        public JwtClaimChecksResponse build() {
            return new JwtClaimChecksResponse(allowedClientApplications, allowedGroups);
        }
    }
}
