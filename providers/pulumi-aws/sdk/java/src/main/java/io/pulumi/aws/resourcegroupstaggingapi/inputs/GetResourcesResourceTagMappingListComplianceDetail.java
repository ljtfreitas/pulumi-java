// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroupstaggingapi.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetResourcesResourceTagMappingListComplianceDetail extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcesResourceTagMappingListComplianceDetail Empty = new GetResourcesResourceTagMappingListComplianceDetail();

    /**
     * Whether the resource is compliant.
     * * ` keys_with_noncompliant_values  ` - Set of tag keys with non-compliant tag values.
     * * ` non_compliant_keys  ` - Set of non-compliant tag keys.
     * 
     */
    @Import(name="complianceStatus", required=true)
      private final Boolean complianceStatus;

    public Boolean getComplianceStatus() {
        return this.complianceStatus;
    }

    @Import(name="keysWithNoncompliantValues", required=true)
      private final List<String> keysWithNoncompliantValues;

    public List<String> getKeysWithNoncompliantValues() {
        return this.keysWithNoncompliantValues;
    }

    @Import(name="nonCompliantKeys", required=true)
      private final List<String> nonCompliantKeys;

    public List<String> getNonCompliantKeys() {
        return this.nonCompliantKeys;
    }

    public GetResourcesResourceTagMappingListComplianceDetail(
        Boolean complianceStatus,
        List<String> keysWithNoncompliantValues,
        List<String> nonCompliantKeys) {
        this.complianceStatus = Objects.requireNonNull(complianceStatus, "expected parameter 'complianceStatus' to be non-null");
        this.keysWithNoncompliantValues = Objects.requireNonNull(keysWithNoncompliantValues, "expected parameter 'keysWithNoncompliantValues' to be non-null");
        this.nonCompliantKeys = Objects.requireNonNull(nonCompliantKeys, "expected parameter 'nonCompliantKeys' to be non-null");
    }

    private GetResourcesResourceTagMappingListComplianceDetail() {
        this.complianceStatus = null;
        this.keysWithNoncompliantValues = List.of();
        this.nonCompliantKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcesResourceTagMappingListComplianceDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean complianceStatus;
        private List<String> keysWithNoncompliantValues;
        private List<String> nonCompliantKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcesResourceTagMappingListComplianceDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.keysWithNoncompliantValues = defaults.keysWithNoncompliantValues;
    	      this.nonCompliantKeys = defaults.nonCompliantKeys;
        }

        public Builder complianceStatus(Boolean complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }

        public Builder keysWithNoncompliantValues(List<String> keysWithNoncompliantValues) {
            this.keysWithNoncompliantValues = Objects.requireNonNull(keysWithNoncompliantValues);
            return this;
        }

        public Builder nonCompliantKeys(List<String> nonCompliantKeys) {
            this.nonCompliantKeys = Objects.requireNonNull(nonCompliantKeys);
            return this;
        }
        public GetResourcesResourceTagMappingListComplianceDetail build() {
            return new GetResourcesResourceTagMappingListComplianceDetail(complianceStatus, keysWithNoncompliantValues, nonCompliantKeys);
        }
    }
}
