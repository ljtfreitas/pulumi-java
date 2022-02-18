// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSentinelOnboardingStateResult {
    /**
     * Flag that indicates the status of the CMK setting
     * 
     */
    private final @Nullable Boolean customerManagedKey;
    /**
     * Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"customerManagedKey","etag","id","name","systemData","type"})
    private GetSentinelOnboardingStateResult(
        @Nullable Boolean customerManagedKey,
        @Nullable String etag,
        String id,
        String name,
        SystemDataResponse systemData,
        String type) {
        this.customerManagedKey = customerManagedKey;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Flag that indicates the status of the CMK setting
     * 
     */
    public Optional<Boolean> getCustomerManagedKey() {
        return Optional.ofNullable(this.customerManagedKey);
    }
    /**
     * Etag of the azure resource
     * 
     */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Azure resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Azure resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Azure resource type
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSentinelOnboardingStateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean customerManagedKey;
        private @Nullable String etag;
        private String id;
        private String name;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSentinelOnboardingStateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedKey = defaults.customerManagedKey;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setCustomerManagedKey(@Nullable Boolean customerManagedKey) {
            this.customerManagedKey = customerManagedKey;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
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

        public GetSentinelOnboardingStateResult build() {
            return new GetSentinelOnboardingStateResult(customerManagedKey, etag, id, name, systemData, type);
        }
    }
}
