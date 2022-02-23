// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.StorageAccountType;
import io.pulumi.azurenative.compute.inputs.EncryptionImagesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the target region information.
 * 
 */
public final class TargetRegionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetRegionArgs Empty = new TargetRegionArgs();

    /**
     * Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery artifact.
     * 
     */
    @InputImport(name="encryption")
        private final @Nullable Input<EncryptionImagesArgs> encryption;

    public Input<EncryptionImagesArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * The name of the region.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The number of replicas of the Image Version to be created per region. This property is updatable.
     * 
     */
    @InputImport(name="regionalReplicaCount")
        private final @Nullable Input<Integer> regionalReplicaCount;

    public Input<Integer> getRegionalReplicaCount() {
        return this.regionalReplicaCount == null ? Input.empty() : this.regionalReplicaCount;
    }

    /**
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    @InputImport(name="storageAccountType")
        private final @Nullable Input<Either<String,StorageAccountType>> storageAccountType;

    public Input<Either<String,StorageAccountType>> getStorageAccountType() {
        return this.storageAccountType == null ? Input.empty() : this.storageAccountType;
    }

    public TargetRegionArgs(
        @Nullable Input<EncryptionImagesArgs> encryption,
        Input<String> name,
        @Nullable Input<Integer> regionalReplicaCount,
        @Nullable Input<Either<String,StorageAccountType>> storageAccountType) {
        this.encryption = encryption;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.regionalReplicaCount = regionalReplicaCount;
        this.storageAccountType = storageAccountType;
    }

    private TargetRegionArgs() {
        this.encryption = Input.empty();
        this.name = Input.empty();
        this.regionalReplicaCount = Input.empty();
        this.storageAccountType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EncryptionImagesArgs> encryption;
        private Input<String> name;
        private @Nullable Input<Integer> regionalReplicaCount;
        private @Nullable Input<Either<String,StorageAccountType>> storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetRegionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.name = defaults.name;
    	      this.regionalReplicaCount = defaults.regionalReplicaCount;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder setEncryption(@Nullable Input<EncryptionImagesArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionImagesArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setRegionalReplicaCount(@Nullable Input<Integer> regionalReplicaCount) {
            this.regionalReplicaCount = regionalReplicaCount;
            return this;
        }

        public Builder setRegionalReplicaCount(@Nullable Integer regionalReplicaCount) {
            this.regionalReplicaCount = Input.ofNullable(regionalReplicaCount);
            return this;
        }

        public Builder setStorageAccountType(@Nullable Input<Either<String,StorageAccountType>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setStorageAccountType(@Nullable Either<String,StorageAccountType> storageAccountType) {
            this.storageAccountType = Input.ofNullable(storageAccountType);
            return this;
        }
        public TargetRegionArgs build() {
            return new TargetRegionArgs(encryption, name, regionalReplicaCount, storageAccountType);
        }
    }
}
