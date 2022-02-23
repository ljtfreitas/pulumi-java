// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.CustomerEncryptionKeyArgs;
import io.pulumi.googlenative.compute_v1.inputs.SavedDiskArgs;
import io.pulumi.googlenative.compute_v1.inputs.SourceDiskEncryptionKeyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineImageArgs Empty = new MachineImageArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    @InputImport(name="guestFlush")
      private final @Nullable Input<Boolean> guestFlush;

    public Input<Boolean> getGuestFlush() {
        return this.guestFlush == null ? Input.empty() : this.guestFlush;
    }

    /**
     * Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
     * 
     */
    @InputImport(name="machineImageEncryptionKey")
      private final @Nullable Input<CustomerEncryptionKeyArgs> machineImageEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getMachineImageEncryptionKey() {
        return this.machineImageEncryptionKey == null ? Input.empty() : this.machineImageEncryptionKey;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * An array of Machine Image specific properties for disks attached to the source instance
     * 
     */
    @InputImport(name="savedDisks")
      private final @Nullable Input<List<SavedDiskArgs>> savedDisks;

    public Input<List<SavedDiskArgs>> getSavedDisks() {
        return this.savedDisks == null ? Input.empty() : this.savedDisks;
    }

    /**
     * [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @InputImport(name="sourceDiskEncryptionKeys")
      private final @Nullable Input<List<SourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKeys;

    public Input<List<SourceDiskEncryptionKeyArgs>> getSourceDiskEncryptionKeys() {
        return this.sourceDiskEncryptionKeys == null ? Input.empty() : this.sourceDiskEncryptionKeys;
    }

    /**
     * The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    @InputImport(name="sourceInstance", required=true)
      private final Input<String> sourceInstance;

    public Input<String> getSourceInstance() {
        return this.sourceInstance;
    }

    /**
     * The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     * 
     */
    @InputImport(name="storageLocations")
      private final @Nullable Input<List<String>> storageLocations;

    public Input<List<String>> getStorageLocations() {
        return this.storageLocations == null ? Input.empty() : this.storageLocations;
    }

    public MachineImageArgs(
        @Nullable Input<String> description,
        @Nullable Input<Boolean> guestFlush,
        @Nullable Input<CustomerEncryptionKeyArgs> machineImageEncryptionKey,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<List<SavedDiskArgs>> savedDisks,
        @Nullable Input<List<SourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKeys,
        Input<String> sourceInstance,
        @Nullable Input<List<String>> storageLocations) {
        this.description = description;
        this.guestFlush = guestFlush;
        this.machineImageEncryptionKey = machineImageEncryptionKey;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.savedDisks = savedDisks;
        this.sourceDiskEncryptionKeys = sourceDiskEncryptionKeys;
        this.sourceInstance = Objects.requireNonNull(sourceInstance, "expected parameter 'sourceInstance' to be non-null");
        this.storageLocations = storageLocations;
    }

    private MachineImageArgs() {
        this.description = Input.empty();
        this.guestFlush = Input.empty();
        this.machineImageEncryptionKey = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.savedDisks = Input.empty();
        this.sourceDiskEncryptionKeys = Input.empty();
        this.sourceInstance = Input.empty();
        this.storageLocations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> guestFlush;
        private @Nullable Input<CustomerEncryptionKeyArgs> machineImageEncryptionKey;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<List<SavedDiskArgs>> savedDisks;
        private @Nullable Input<List<SourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKeys;
        private Input<String> sourceInstance;
        private @Nullable Input<List<String>> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.guestFlush = defaults.guestFlush;
    	      this.machineImageEncryptionKey = defaults.machineImageEncryptionKey;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.savedDisks = defaults.savedDisks;
    	      this.sourceDiskEncryptionKeys = defaults.sourceDiskEncryptionKeys;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGuestFlush(@Nullable Input<Boolean> guestFlush) {
            this.guestFlush = guestFlush;
            return this;
        }

        public Builder setGuestFlush(@Nullable Boolean guestFlush) {
            this.guestFlush = Input.ofNullable(guestFlush);
            return this;
        }

        public Builder setMachineImageEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> machineImageEncryptionKey) {
            this.machineImageEncryptionKey = machineImageEncryptionKey;
            return this;
        }

        public Builder setMachineImageEncryptionKey(@Nullable CustomerEncryptionKeyArgs machineImageEncryptionKey) {
            this.machineImageEncryptionKey = Input.ofNullable(machineImageEncryptionKey);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSavedDisks(@Nullable Input<List<SavedDiskArgs>> savedDisks) {
            this.savedDisks = savedDisks;
            return this;
        }

        public Builder setSavedDisks(@Nullable List<SavedDiskArgs> savedDisks) {
            this.savedDisks = Input.ofNullable(savedDisks);
            return this;
        }

        public Builder setSourceDiskEncryptionKeys(@Nullable Input<List<SourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKeys) {
            this.sourceDiskEncryptionKeys = sourceDiskEncryptionKeys;
            return this;
        }

        public Builder setSourceDiskEncryptionKeys(@Nullable List<SourceDiskEncryptionKeyArgs> sourceDiskEncryptionKeys) {
            this.sourceDiskEncryptionKeys = Input.ofNullable(sourceDiskEncryptionKeys);
            return this;
        }

        public Builder setSourceInstance(Input<String> sourceInstance) {
            this.sourceInstance = Objects.requireNonNull(sourceInstance);
            return this;
        }

        public Builder setSourceInstance(String sourceInstance) {
            this.sourceInstance = Input.of(Objects.requireNonNull(sourceInstance));
            return this;
        }

        public Builder setStorageLocations(@Nullable Input<List<String>> storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }

        public Builder setStorageLocations(@Nullable List<String> storageLocations) {
            this.storageLocations = Input.ofNullable(storageLocations);
            return this;
        }
        public MachineImageArgs build() {
            return new MachineImageArgs(description, guestFlush, machineImageEncryptionKey, name, project, requestId, savedDisks, sourceDiskEncryptionKeys, sourceInstance, storageLocations);
        }
    }
}
