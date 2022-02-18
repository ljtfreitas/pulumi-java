// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VMwareCbt container mapping input.
 * 
 */
public final class VMwareCbtContainerMappingInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final VMwareCbtContainerMappingInputArgs Empty = new VMwareCbtContainerMappingInputArgs();

    /**
     * The class type.
     * Expected value is 'VMwareCbt'.
     * 
     */
    @InputImport(name="instanceType")
    private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The target key vault ARM Id.
     * 
     */
    @InputImport(name="keyVaultId", required=true)
    private final Input<String> keyVaultId;

    public Input<String> getKeyVaultId() {
        return this.keyVaultId;
    }

    /**
     * The target key vault URL.
     * 
     */
    @InputImport(name="keyVaultUri", required=true)
    private final Input<String> keyVaultUri;

    public Input<String> getKeyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * The secret name of the service bus connection string.
     * 
     */
    @InputImport(name="serviceBusConnectionStringSecretName", required=true)
    private final Input<String> serviceBusConnectionStringSecretName;

    public Input<String> getServiceBusConnectionStringSecretName() {
        return this.serviceBusConnectionStringSecretName;
    }

    /**
     * The storage account ARM Id.
     * 
     */
    @InputImport(name="storageAccountId", required=true)
    private final Input<String> storageAccountId;

    public Input<String> getStorageAccountId() {
        return this.storageAccountId;
    }

    /**
     * The secret name of the storage account.
     * 
     */
    @InputImport(name="storageAccountSasSecretName", required=true)
    private final Input<String> storageAccountSasSecretName;

    public Input<String> getStorageAccountSasSecretName() {
        return this.storageAccountSasSecretName;
    }

    /**
     * The target location.
     * 
     */
    @InputImport(name="targetLocation", required=true)
    private final Input<String> targetLocation;

    public Input<String> getTargetLocation() {
        return this.targetLocation;
    }

    public VMwareCbtContainerMappingInputArgs(
        @Nullable Input<String> instanceType,
        Input<String> keyVaultId,
        Input<String> keyVaultUri,
        Input<String> serviceBusConnectionStringSecretName,
        Input<String> storageAccountId,
        Input<String> storageAccountSasSecretName,
        Input<String> targetLocation) {
        this.instanceType = instanceType;
        this.keyVaultId = Objects.requireNonNull(keyVaultId, "expected parameter 'keyVaultId' to be non-null");
        this.keyVaultUri = Objects.requireNonNull(keyVaultUri, "expected parameter 'keyVaultUri' to be non-null");
        this.serviceBusConnectionStringSecretName = Objects.requireNonNull(serviceBusConnectionStringSecretName, "expected parameter 'serviceBusConnectionStringSecretName' to be non-null");
        this.storageAccountId = Objects.requireNonNull(storageAccountId, "expected parameter 'storageAccountId' to be non-null");
        this.storageAccountSasSecretName = Objects.requireNonNull(storageAccountSasSecretName, "expected parameter 'storageAccountSasSecretName' to be non-null");
        this.targetLocation = Objects.requireNonNull(targetLocation, "expected parameter 'targetLocation' to be non-null");
    }

    private VMwareCbtContainerMappingInputArgs() {
        this.instanceType = Input.empty();
        this.keyVaultId = Input.empty();
        this.keyVaultUri = Input.empty();
        this.serviceBusConnectionStringSecretName = Input.empty();
        this.storageAccountId = Input.empty();
        this.storageAccountSasSecretName = Input.empty();
        this.targetLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtContainerMappingInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceType;
        private Input<String> keyVaultId;
        private Input<String> keyVaultUri;
        private Input<String> serviceBusConnectionStringSecretName;
        private Input<String> storageAccountId;
        private Input<String> storageAccountSasSecretName;
        private Input<String> targetLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtContainerMappingInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.serviceBusConnectionStringSecretName = defaults.serviceBusConnectionStringSecretName;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.storageAccountSasSecretName = defaults.storageAccountSasSecretName;
    	      this.targetLocation = defaults.targetLocation;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setKeyVaultId(Input<String> keyVaultId) {
            this.keyVaultId = Objects.requireNonNull(keyVaultId);
            return this;
        }

        public Builder setKeyVaultId(String keyVaultId) {
            this.keyVaultId = Input.of(Objects.requireNonNull(keyVaultId));
            return this;
        }

        public Builder setKeyVaultUri(Input<String> keyVaultUri) {
            this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
            return this;
        }

        public Builder setKeyVaultUri(String keyVaultUri) {
            this.keyVaultUri = Input.of(Objects.requireNonNull(keyVaultUri));
            return this;
        }

        public Builder setServiceBusConnectionStringSecretName(Input<String> serviceBusConnectionStringSecretName) {
            this.serviceBusConnectionStringSecretName = Objects.requireNonNull(serviceBusConnectionStringSecretName);
            return this;
        }

        public Builder setServiceBusConnectionStringSecretName(String serviceBusConnectionStringSecretName) {
            this.serviceBusConnectionStringSecretName = Input.of(Objects.requireNonNull(serviceBusConnectionStringSecretName));
            return this;
        }

        public Builder setStorageAccountId(Input<String> storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }

        public Builder setStorageAccountId(String storageAccountId) {
            this.storageAccountId = Input.of(Objects.requireNonNull(storageAccountId));
            return this;
        }

        public Builder setStorageAccountSasSecretName(Input<String> storageAccountSasSecretName) {
            this.storageAccountSasSecretName = Objects.requireNonNull(storageAccountSasSecretName);
            return this;
        }

        public Builder setStorageAccountSasSecretName(String storageAccountSasSecretName) {
            this.storageAccountSasSecretName = Input.of(Objects.requireNonNull(storageAccountSasSecretName));
            return this;
        }

        public Builder setTargetLocation(Input<String> targetLocation) {
            this.targetLocation = Objects.requireNonNull(targetLocation);
            return this;
        }

        public Builder setTargetLocation(String targetLocation) {
            this.targetLocation = Input.of(Objects.requireNonNull(targetLocation));
            return this;
        }

        public VMwareCbtContainerMappingInputArgs build() {
            return new VMwareCbtContainerMappingInputArgs(instanceType, keyVaultId, keyVaultUri, serviceBusConnectionStringSecretName, storageAccountId, storageAccountSasSecretName, targetLocation);
        }
    }
}
