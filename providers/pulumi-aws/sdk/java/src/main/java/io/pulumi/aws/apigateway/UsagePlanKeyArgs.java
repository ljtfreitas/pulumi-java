// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class UsagePlanKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final UsagePlanKeyArgs Empty = new UsagePlanKeyArgs();

    /**
     * The identifier of the API key resource.
     * 
     */
    @InputImport(name="keyId", required=true)
    private final Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId;
    }

    /**
     * The type of the API key resource. Currently, the valid key type is API_KEY.
     * 
     */
    @InputImport(name="keyType", required=true)
    private final Input<String> keyType;

    public Input<String> getKeyType() {
        return this.keyType;
    }

    /**
     * The Id of the usage plan resource representing to associate the key to.
     * 
     */
    @InputImport(name="usagePlanId", required=true)
    private final Input<String> usagePlanId;

    public Input<String> getUsagePlanId() {
        return this.usagePlanId;
    }

    public UsagePlanKeyArgs(
        Input<String> keyId,
        Input<String> keyType,
        Input<String> usagePlanId) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
        this.usagePlanId = Objects.requireNonNull(usagePlanId, "expected parameter 'usagePlanId' to be non-null");
    }

    private UsagePlanKeyArgs() {
        this.keyId = Input.empty();
        this.keyType = Input.empty();
        this.usagePlanId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyId;
        private Input<String> keyType;
        private Input<String> usagePlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keyType = defaults.keyType;
    	      this.usagePlanId = defaults.usagePlanId;
        }

        public Builder setKeyId(Input<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Input.of(Objects.requireNonNull(keyId));
            return this;
        }

        public Builder setKeyType(Input<String> keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }

        public Builder setKeyType(String keyType) {
            this.keyType = Input.of(Objects.requireNonNull(keyType));
            return this;
        }

        public Builder setUsagePlanId(Input<String> usagePlanId) {
            this.usagePlanId = Objects.requireNonNull(usagePlanId);
            return this;
        }

        public Builder setUsagePlanId(String usagePlanId) {
            this.usagePlanId = Input.of(Objects.requireNonNull(usagePlanId));
            return this;
        }
        public UsagePlanKeyArgs build() {
            return new UsagePlanKeyArgs(keyId, keyType, usagePlanId);
        }
    }
}