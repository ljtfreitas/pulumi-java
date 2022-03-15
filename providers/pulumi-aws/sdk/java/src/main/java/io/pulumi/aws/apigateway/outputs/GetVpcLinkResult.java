// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVpcLinkResult {
    /**
     * The description of the VPC link.
     * 
     */
    private final String description;
    /**
     * Set to the ID of the found API Gateway VPC Link.
     * 
     */
    private final String id;
    private final String name;
    /**
     * The status of the VPC link.
     * 
     */
    private final String status;
    /**
     * The status message of the VPC link.
     * 
     */
    private final String statusMessage;
    /**
     * Key-value map of resource tags
     * 
     */
    private final Map<String,String> tags;
    /**
     * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
     * 
     */
    private final List<String> targetArns;

    @CustomType.Constructor
    private GetVpcLinkResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusMessage") String statusMessage,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("targetArns") List<String> targetArns) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.status = status;
        this.statusMessage = statusMessage;
        this.tags = tags;
        this.targetArns = targetArns;
    }

    /**
     * The description of the VPC link.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Set to the ID of the found API Gateway VPC Link.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The status of the VPC link.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The status message of the VPC link.
     * 
    */
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Key-value map of resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
     * 
    */
    public List<String> getTargetArns() {
        return this.targetArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String status;
        private String statusMessage;
        private Map<String,String> tags;
        private List<String> targetArns;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tags = defaults.tags;
    	      this.targetArns = defaults.targetArns;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder targetArns(List<String> targetArns) {
            this.targetArns = Objects.requireNonNull(targetArns);
            return this;
        }
        public GetVpcLinkResult build() {
            return new GetVpcLinkResult(description, id, name, status, statusMessage, tags, targetArns);
        }
    }
}
