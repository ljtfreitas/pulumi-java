// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ResourceDataSyncAwsOrganizationsSource {
    private final String organizationSourceType;
    private final @Nullable List<String> organizationalUnits;

    @CustomType.Constructor
    private ResourceDataSyncAwsOrganizationsSource(
        @CustomType.Parameter("organizationSourceType") String organizationSourceType,
        @CustomType.Parameter("organizationalUnits") @Nullable List<String> organizationalUnits) {
        this.organizationSourceType = organizationSourceType;
        this.organizationalUnits = organizationalUnits;
    }

    public String getOrganizationSourceType() {
        return this.organizationSourceType;
    }
    public List<String> getOrganizationalUnits() {
        return this.organizationalUnits == null ? List.of() : this.organizationalUnits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceDataSyncAwsOrganizationsSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String organizationSourceType;
        private @Nullable List<String> organizationalUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceDataSyncAwsOrganizationsSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationSourceType = defaults.organizationSourceType;
    	      this.organizationalUnits = defaults.organizationalUnits;
        }

        public Builder organizationSourceType(String organizationSourceType) {
            this.organizationSourceType = Objects.requireNonNull(organizationSourceType);
            return this;
        }

        public Builder organizationalUnits(@Nullable List<String> organizationalUnits) {
            this.organizationalUnits = organizationalUnits;
            return this;
        }
        public ResourceDataSyncAwsOrganizationsSource build() {
            return new ResourceDataSyncAwsOrganizationsSource(organizationSourceType, organizationalUnits);
        }
    }
}
