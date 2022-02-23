// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroupstaggingapi.inputs;

import io.pulumi.aws.resourcegroupstaggingapi.inputs.GetResourcesResourceTagMappingListComplianceDetail;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetResourcesResourceTagMappingList extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcesResourceTagMappingList Empty = new GetResourcesResourceTagMappingList();

    /**
     * List of objects with information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
     * 
     */
    @InputImport(name="complianceDetails", required=true)
    private final List<GetResourcesResourceTagMappingListComplianceDetail> complianceDetails;

    public List<GetResourcesResourceTagMappingListComplianceDetail> getComplianceDetails() {
        return this.complianceDetails;
    }

    /**
     * ARN of the resource.
     * 
     */
    @InputImport(name="resourceArn", required=true)
    private final String resourceArn;

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * Map of tags assigned to the resource.
     * 
     */
    @InputImport(name="tags", required=true)
    private final Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags;
    }

    public GetResourcesResourceTagMappingList(
        List<GetResourcesResourceTagMappingListComplianceDetail> complianceDetails,
        String resourceArn,
        Map<String,String> tags) {
        this.complianceDetails = Objects.requireNonNull(complianceDetails, "expected parameter 'complianceDetails' to be non-null");
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
    }

    private GetResourcesResourceTagMappingList() {
        this.complianceDetails = List.of();
        this.resourceArn = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcesResourceTagMappingList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetResourcesResourceTagMappingListComplianceDetail> complianceDetails;
        private String resourceArn;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcesResourceTagMappingList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceDetails = defaults.complianceDetails;
    	      this.resourceArn = defaults.resourceArn;
    	      this.tags = defaults.tags;
        }

        public Builder setComplianceDetails(List<GetResourcesResourceTagMappingListComplianceDetail> complianceDetails) {
            this.complianceDetails = Objects.requireNonNull(complianceDetails);
            return this;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetResourcesResourceTagMappingList build() {
            return new GetResourcesResourceTagMappingList(complianceDetails, resourceArn, tags);
        }
    }
}
