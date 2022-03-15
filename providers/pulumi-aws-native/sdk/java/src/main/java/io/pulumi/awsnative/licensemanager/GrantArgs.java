// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GrantArgs extends io.pulumi.resources.ResourceArgs {

    public static final GrantArgs Empty = new GrantArgs();

    @Import(name="allowedOperations")
      private final @Nullable Output<List<String>> allowedOperations;

    public Output<List<String>> getAllowedOperations() {
        return this.allowedOperations == null ? Output.empty() : this.allowedOperations;
    }

    /**
     * Name for the created Grant.
     * 
     */
    @Import(name="grantName")
      private final @Nullable Output<String> grantName;

    public Output<String> getGrantName() {
        return this.grantName == null ? Output.empty() : this.grantName;
    }

    /**
     * Home region for the created grant.
     * 
     */
    @Import(name="homeRegion")
      private final @Nullable Output<String> homeRegion;

    public Output<String> getHomeRegion() {
        return this.homeRegion == null ? Output.empty() : this.homeRegion;
    }

    /**
     * License Arn for the grant.
     * 
     */
    @Import(name="licenseArn")
      private final @Nullable Output<String> licenseArn;

    public Output<String> getLicenseArn() {
        return this.licenseArn == null ? Output.empty() : this.licenseArn;
    }

    @Import(name="principals")
      private final @Nullable Output<List<String>> principals;

    public Output<List<String>> getPrincipals() {
        return this.principals == null ? Output.empty() : this.principals;
    }

    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public GrantArgs(
        @Nullable Output<List<String>> allowedOperations,
        @Nullable Output<String> grantName,
        @Nullable Output<String> homeRegion,
        @Nullable Output<String> licenseArn,
        @Nullable Output<List<String>> principals,
        @Nullable Output<String> status) {
        this.allowedOperations = allowedOperations;
        this.grantName = grantName;
        this.homeRegion = homeRegion;
        this.licenseArn = licenseArn;
        this.principals = principals;
        this.status = status;
    }

    private GrantArgs() {
        this.allowedOperations = Output.empty();
        this.grantName = Output.empty();
        this.homeRegion = Output.empty();
        this.licenseArn = Output.empty();
        this.principals = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedOperations;
        private @Nullable Output<String> grantName;
        private @Nullable Output<String> homeRegion;
        private @Nullable Output<String> licenseArn;
        private @Nullable Output<List<String>> principals;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(GrantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOperations = defaults.allowedOperations;
    	      this.grantName = defaults.grantName;
    	      this.homeRegion = defaults.homeRegion;
    	      this.licenseArn = defaults.licenseArn;
    	      this.principals = defaults.principals;
    	      this.status = defaults.status;
        }

        public Builder allowedOperations(@Nullable Output<List<String>> allowedOperations) {
            this.allowedOperations = allowedOperations;
            return this;
        }

        public Builder allowedOperations(@Nullable List<String> allowedOperations) {
            this.allowedOperations = Output.ofNullable(allowedOperations);
            return this;
        }

        public Builder grantName(@Nullable Output<String> grantName) {
            this.grantName = grantName;
            return this;
        }

        public Builder grantName(@Nullable String grantName) {
            this.grantName = Output.ofNullable(grantName);
            return this;
        }

        public Builder homeRegion(@Nullable Output<String> homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }

        public Builder homeRegion(@Nullable String homeRegion) {
            this.homeRegion = Output.ofNullable(homeRegion);
            return this;
        }

        public Builder licenseArn(@Nullable Output<String> licenseArn) {
            this.licenseArn = licenseArn;
            return this;
        }

        public Builder licenseArn(@Nullable String licenseArn) {
            this.licenseArn = Output.ofNullable(licenseArn);
            return this;
        }

        public Builder principals(@Nullable Output<List<String>> principals) {
            this.principals = principals;
            return this;
        }

        public Builder principals(@Nullable List<String> principals) {
            this.principals = Output.ofNullable(principals);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public GrantArgs build() {
            return new GrantArgs(allowedOperations, grantName, homeRegion, licenseArn, principals, status);
        }
    }
}
