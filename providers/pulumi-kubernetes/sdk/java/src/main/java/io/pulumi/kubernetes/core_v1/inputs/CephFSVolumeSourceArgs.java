// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
public final class CephFSVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CephFSVolumeSourceArgs Empty = new CephFSVolumeSourceArgs();

    /**
     * Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @Import(name="monitors", required=true)
      private final Output<List<String>> monitors;

    public Output<List<String>> getMonitors() {
        return this.monitors;
    }

    /**
     * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> getReadOnly() {
        return this.readOnly == null ? Output.empty() : this.readOnly;
    }

    /**
     * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @Import(name="secretFile")
      private final @Nullable Output<String> secretFile;

    public Output<String> getSecretFile() {
        return this.secretFile == null ? Output.empty() : this.secretFile;
    }

    /**
     * Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @Import(name="secretRef")
      private final @Nullable Output<LocalObjectReferenceArgs> secretRef;

    public Output<LocalObjectReferenceArgs> getSecretRef() {
        return this.secretRef == null ? Output.empty() : this.secretRef;
    }

    /**
     * Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    @Import(name="user")
      private final @Nullable Output<String> user;

    public Output<String> getUser() {
        return this.user == null ? Output.empty() : this.user;
    }

    public CephFSVolumeSourceArgs(
        Output<List<String>> monitors,
        @Nullable Output<String> path,
        @Nullable Output<Boolean> readOnly,
        @Nullable Output<String> secretFile,
        @Nullable Output<LocalObjectReferenceArgs> secretRef,
        @Nullable Output<String> user) {
        this.monitors = Objects.requireNonNull(monitors, "expected parameter 'monitors' to be non-null");
        this.path = path;
        this.readOnly = readOnly;
        this.secretFile = secretFile;
        this.secretRef = secretRef;
        this.user = user;
    }

    private CephFSVolumeSourceArgs() {
        this.monitors = Output.empty();
        this.path = Output.empty();
        this.readOnly = Output.empty();
        this.secretFile = Output.empty();
        this.secretRef = Output.empty();
        this.user = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CephFSVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> monitors;
        private @Nullable Output<String> path;
        private @Nullable Output<Boolean> readOnly;
        private @Nullable Output<String> secretFile;
        private @Nullable Output<LocalObjectReferenceArgs> secretRef;
        private @Nullable Output<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(CephFSVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitors = defaults.monitors;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.secretFile = defaults.secretFile;
    	      this.secretRef = defaults.secretRef;
    	      this.user = defaults.user;
        }

        public Builder monitors(Output<List<String>> monitors) {
            this.monitors = Objects.requireNonNull(monitors);
            return this;
        }

        public Builder monitors(List<String> monitors) {
            this.monitors = Output.of(Objects.requireNonNull(monitors));
            return this;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Output.ofNullable(readOnly);
            return this;
        }

        public Builder secretFile(@Nullable Output<String> secretFile) {
            this.secretFile = secretFile;
            return this;
        }

        public Builder secretFile(@Nullable String secretFile) {
            this.secretFile = Output.ofNullable(secretFile);
            return this;
        }

        public Builder secretRef(@Nullable Output<LocalObjectReferenceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder secretRef(@Nullable LocalObjectReferenceArgs secretRef) {
            this.secretRef = Output.ofNullable(secretRef);
            return this;
        }

        public Builder user(@Nullable Output<String> user) {
            this.user = user;
            return this;
        }

        public Builder user(@Nullable String user) {
            this.user = Output.ofNullable(user);
            return this;
        }
        public CephFSVolumeSourceArgs build() {
            return new CephFSVolumeSourceArgs(monitors, path, readOnly, secretFile, secretRef, user);
        }
    }
}
