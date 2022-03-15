// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the checks that should be made while validating the JWT Claims.
 * 
 */
public final class JwtClaimChecksArgs extends io.pulumi.resources.ResourceArgs {

    public static final JwtClaimChecksArgs Empty = new JwtClaimChecksArgs();

    /**
     * The list of the allowed client applications.
     * 
     */
    @Import(name="allowedClientApplications")
      private final @Nullable Output<List<String>> allowedClientApplications;

    public Output<List<String>> getAllowedClientApplications() {
        return this.allowedClientApplications == null ? Output.empty() : this.allowedClientApplications;
    }

    /**
     * The list of the allowed groups.
     * 
     */
    @Import(name="allowedGroups")
      private final @Nullable Output<List<String>> allowedGroups;

    public Output<List<String>> getAllowedGroups() {
        return this.allowedGroups == null ? Output.empty() : this.allowedGroups;
    }

    public JwtClaimChecksArgs(
        @Nullable Output<List<String>> allowedClientApplications,
        @Nullable Output<List<String>> allowedGroups) {
        this.allowedClientApplications = allowedClientApplications;
        this.allowedGroups = allowedGroups;
    }

    private JwtClaimChecksArgs() {
        this.allowedClientApplications = Output.empty();
        this.allowedGroups = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtClaimChecksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedClientApplications;
        private @Nullable Output<List<String>> allowedGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtClaimChecksArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedClientApplications = defaults.allowedClientApplications;
    	      this.allowedGroups = defaults.allowedGroups;
        }

        public Builder allowedClientApplications(@Nullable Output<List<String>> allowedClientApplications) {
            this.allowedClientApplications = allowedClientApplications;
            return this;
        }

        public Builder allowedClientApplications(@Nullable List<String> allowedClientApplications) {
            this.allowedClientApplications = Output.ofNullable(allowedClientApplications);
            return this;
        }

        public Builder allowedGroups(@Nullable Output<List<String>> allowedGroups) {
            this.allowedGroups = allowedGroups;
            return this;
        }

        public Builder allowedGroups(@Nullable List<String> allowedGroups) {
            this.allowedGroups = Output.ofNullable(allowedGroups);
            return this;
        }
        public JwtClaimChecksArgs build() {
            return new JwtClaimChecksArgs(allowedClientApplications, allowedGroups);
        }
    }
}
