// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateBootDiskInitializeParams;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceFromTemplateBootDisk {
    private final @Nullable Boolean autoDelete;
    private final @Nullable String deviceName;
    private final @Nullable String diskEncryptionKeyRaw;
    private final @Nullable String diskEncryptionKeySha256;
    private final @Nullable InstanceFromTemplateBootDiskInitializeParams initializeParams;
    private final @Nullable String kmsKeySelfLink;
    private final @Nullable String mode;
    private final @Nullable String source;

    @CustomType.Constructor
    private InstanceFromTemplateBootDisk(
        @CustomType.Parameter("autoDelete") @Nullable Boolean autoDelete,
        @CustomType.Parameter("deviceName") @Nullable String deviceName,
        @CustomType.Parameter("diskEncryptionKeyRaw") @Nullable String diskEncryptionKeyRaw,
        @CustomType.Parameter("diskEncryptionKeySha256") @Nullable String diskEncryptionKeySha256,
        @CustomType.Parameter("initializeParams") @Nullable InstanceFromTemplateBootDiskInitializeParams initializeParams,
        @CustomType.Parameter("kmsKeySelfLink") @Nullable String kmsKeySelfLink,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("source") @Nullable String source) {
        this.autoDelete = autoDelete;
        this.deviceName = deviceName;
        this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
        this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
        this.initializeParams = initializeParams;
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.mode = mode;
        this.source = source;
    }

    public Optional<Boolean> getAutoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }
    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    public Optional<String> getDiskEncryptionKeyRaw() {
        return Optional.ofNullable(this.diskEncryptionKeyRaw);
    }
    public Optional<String> getDiskEncryptionKeySha256() {
        return Optional.ofNullable(this.diskEncryptionKeySha256);
    }
    public Optional<InstanceFromTemplateBootDiskInitializeParams> getInitializeParams() {
        return Optional.ofNullable(this.initializeParams);
    }
    public Optional<String> getKmsKeySelfLink() {
        return Optional.ofNullable(this.kmsKeySelfLink);
    }
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateBootDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoDelete;
        private @Nullable String deviceName;
        private @Nullable String diskEncryptionKeyRaw;
        private @Nullable String diskEncryptionKeySha256;
        private @Nullable InstanceFromTemplateBootDiskInitializeParams initializeParams;
        private @Nullable String kmsKeySelfLink;
        private @Nullable String mode;
        private @Nullable String source;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateBootDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeyRaw = defaults.diskEncryptionKeyRaw;
    	      this.diskEncryptionKeySha256 = defaults.diskEncryptionKeySha256;
    	      this.initializeParams = defaults.initializeParams;
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder autoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }

        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder diskEncryptionKeyRaw(@Nullable String diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
            return this;
        }

        public Builder diskEncryptionKeySha256(@Nullable String diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
            return this;
        }

        public Builder initializeParams(@Nullable InstanceFromTemplateBootDiskInitializeParams initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }

        public Builder kmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public InstanceFromTemplateBootDisk build() {
            return new InstanceFromTemplateBootDisk(autoDelete, deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, initializeParams, kmsKeySelfLink, mode, source);
        }
    }
}
