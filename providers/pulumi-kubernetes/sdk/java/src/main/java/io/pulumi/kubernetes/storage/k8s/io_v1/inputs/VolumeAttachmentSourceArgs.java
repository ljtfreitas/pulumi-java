// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.PersistentVolumeSpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
 * 
 */
public final class VolumeAttachmentSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentSourceArgs Empty = new VolumeAttachmentSourceArgs();

    /**
     * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is beta-level and is only honored by servers that enabled the CSIMigration feature.
     * 
     */
    @Import(name="inlineVolumeSpec")
      private final @Nullable Output<PersistentVolumeSpecArgs> inlineVolumeSpec;

    public Output<PersistentVolumeSpecArgs> getInlineVolumeSpec() {
        return this.inlineVolumeSpec == null ? Output.empty() : this.inlineVolumeSpec;
    }

    /**
     * Name of the persistent volume to attach.
     * 
     */
    @Import(name="persistentVolumeName")
      private final @Nullable Output<String> persistentVolumeName;

    public Output<String> getPersistentVolumeName() {
        return this.persistentVolumeName == null ? Output.empty() : this.persistentVolumeName;
    }

    public VolumeAttachmentSourceArgs(
        @Nullable Output<PersistentVolumeSpecArgs> inlineVolumeSpec,
        @Nullable Output<String> persistentVolumeName) {
        this.inlineVolumeSpec = inlineVolumeSpec;
        this.persistentVolumeName = persistentVolumeName;
    }

    private VolumeAttachmentSourceArgs() {
        this.inlineVolumeSpec = Output.empty();
        this.persistentVolumeName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PersistentVolumeSpecArgs> inlineVolumeSpec;
        private @Nullable Output<String> persistentVolumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineVolumeSpec = defaults.inlineVolumeSpec;
    	      this.persistentVolumeName = defaults.persistentVolumeName;
        }

        public Builder inlineVolumeSpec(@Nullable Output<PersistentVolumeSpecArgs> inlineVolumeSpec) {
            this.inlineVolumeSpec = inlineVolumeSpec;
            return this;
        }

        public Builder inlineVolumeSpec(@Nullable PersistentVolumeSpecArgs inlineVolumeSpec) {
            this.inlineVolumeSpec = Output.ofNullable(inlineVolumeSpec);
            return this;
        }

        public Builder persistentVolumeName(@Nullable Output<String> persistentVolumeName) {
            this.persistentVolumeName = persistentVolumeName;
            return this;
        }

        public Builder persistentVolumeName(@Nullable String persistentVolumeName) {
            this.persistentVolumeName = Output.ofNullable(persistentVolumeName);
            return this;
        }
        public VolumeAttachmentSourceArgs build() {
            return new VolumeAttachmentSourceArgs(inlineVolumeSpec, persistentVolumeName);
        }
    }
}
