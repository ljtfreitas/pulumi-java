// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.ContentKeyPolicyOptionResponse;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContentKeyPolicyResult {
    /**
     * The creation date of the Policy
     * 
     */
    private final String created;
    /**
     * A description for the Policy.
     * 
     */
    private final @Nullable String description;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The last modified date of the Policy
     * 
     */
    private final String lastModified;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The Key Policy options.
     * 
     */
    private final List<ContentKeyPolicyOptionResponse> options;
    /**
     * The legacy Policy ID.
     * 
     */
    private final String policyId;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"created","description","id","lastModified","name","options","policyId","systemData","type"})
    private GetContentKeyPolicyResult(
        String created,
        @Nullable String description,
        String id,
        String lastModified,
        String name,
        List<ContentKeyPolicyOptionResponse> options,
        String policyId,
        SystemDataResponse systemData,
        String type) {
        this.created = Objects.requireNonNull(created);
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.name = Objects.requireNonNull(name);
        this.options = Objects.requireNonNull(options);
        this.policyId = Objects.requireNonNull(policyId);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The creation date of the Policy
     * 
     */
    public String getCreated() {
        return this.created;
    }
    /**
     * A description for the Policy.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The last modified date of the Policy
     * 
     */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The Key Policy options.
     * 
     */
    public List<ContentKeyPolicyOptionResponse> getOptions() {
        return this.options;
    }
    /**
     * The legacy Policy ID.
     * 
     */
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContentKeyPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private @Nullable String description;
        private String id;
        private String lastModified;
        private String name;
        private List<ContentKeyPolicyOptionResponse> options;
        private String policyId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContentKeyPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.policyId = defaults.policyId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptions(List<ContentKeyPolicyOptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetContentKeyPolicyResult build() {
            return new GetContentKeyPolicyResult(created, description, id, lastModified, name, options, policyId, systemData, type);
        }
    }
}
