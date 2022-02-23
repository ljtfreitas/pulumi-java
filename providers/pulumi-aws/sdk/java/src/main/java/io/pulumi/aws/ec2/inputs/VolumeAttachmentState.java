// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentState Empty = new VolumeAttachmentState();

    /**
     * The device name to expose to the instance (for
     * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
     * 
     */
    @InputImport(name="deviceName")
    private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * Set to `true` if you want to force the
     * volume to detach. Useful if previous attempts failed, but use this option only
     * as a last resort, as this can result in **data loss**. See
     * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
     * 
     */
    @InputImport(name="forceDetach")
    private final @Nullable Input<Boolean> forceDetach;

    public Input<Boolean> getForceDetach() {
        return this.forceDetach == null ? Input.empty() : this.forceDetach;
    }

    /**
     * ID of the Instance to attach to
     * 
     */
    @InputImport(name="instanceId")
    private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    /**
     * Set this to true if you do not wish
     * to detach the volume from the instance to which it is attached at destroy
     * time, and instead just remove the attachment from this provider state. This is
     * useful when destroying an instance which has volumes created by some other
     * means attached.
     * 
     */
    @InputImport(name="skipDestroy")
    private final @Nullable Input<Boolean> skipDestroy;

    public Input<Boolean> getSkipDestroy() {
        return this.skipDestroy == null ? Input.empty() : this.skipDestroy;
    }

    /**
     * Set this to true to ensure that the target instance is stopped
     * before trying to detach the volume. Stops the instance, if it is not already stopped.
     * 
     */
    @InputImport(name="stopInstanceBeforeDetaching")
    private final @Nullable Input<Boolean> stopInstanceBeforeDetaching;

    public Input<Boolean> getStopInstanceBeforeDetaching() {
        return this.stopInstanceBeforeDetaching == null ? Input.empty() : this.stopInstanceBeforeDetaching;
    }

    /**
     * ID of the Volume to be attached
     * 
     */
    @InputImport(name="volumeId")
    private final @Nullable Input<String> volumeId;

    public Input<String> getVolumeId() {
        return this.volumeId == null ? Input.empty() : this.volumeId;
    }

    public VolumeAttachmentState(
        @Nullable Input<String> deviceName,
        @Nullable Input<Boolean> forceDetach,
        @Nullable Input<String> instanceId,
        @Nullable Input<Boolean> skipDestroy,
        @Nullable Input<Boolean> stopInstanceBeforeDetaching,
        @Nullable Input<String> volumeId) {
        this.deviceName = deviceName;
        this.forceDetach = forceDetach;
        this.instanceId = instanceId;
        this.skipDestroy = skipDestroy;
        this.stopInstanceBeforeDetaching = stopInstanceBeforeDetaching;
        this.volumeId = volumeId;
    }

    private VolumeAttachmentState() {
        this.deviceName = Input.empty();
        this.forceDetach = Input.empty();
        this.instanceId = Input.empty();
        this.skipDestroy = Input.empty();
        this.stopInstanceBeforeDetaching = Input.empty();
        this.volumeId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deviceName;
        private @Nullable Input<Boolean> forceDetach;
        private @Nullable Input<String> instanceId;
        private @Nullable Input<Boolean> skipDestroy;
        private @Nullable Input<Boolean> stopInstanceBeforeDetaching;
        private @Nullable Input<String> volumeId;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.forceDetach = defaults.forceDetach;
    	      this.instanceId = defaults.instanceId;
    	      this.skipDestroy = defaults.skipDestroy;
    	      this.stopInstanceBeforeDetaching = defaults.stopInstanceBeforeDetaching;
    	      this.volumeId = defaults.volumeId;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setForceDetach(@Nullable Input<Boolean> forceDetach) {
            this.forceDetach = forceDetach;
            return this;
        }

        public Builder setForceDetach(@Nullable Boolean forceDetach) {
            this.forceDetach = Input.ofNullable(forceDetach);
            return this;
        }

        public Builder setInstanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
            return this;
        }

        public Builder setSkipDestroy(@Nullable Input<Boolean> skipDestroy) {
            this.skipDestroy = skipDestroy;
            return this;
        }

        public Builder setSkipDestroy(@Nullable Boolean skipDestroy) {
            this.skipDestroy = Input.ofNullable(skipDestroy);
            return this;
        }

        public Builder setStopInstanceBeforeDetaching(@Nullable Input<Boolean> stopInstanceBeforeDetaching) {
            this.stopInstanceBeforeDetaching = stopInstanceBeforeDetaching;
            return this;
        }

        public Builder setStopInstanceBeforeDetaching(@Nullable Boolean stopInstanceBeforeDetaching) {
            this.stopInstanceBeforeDetaching = Input.ofNullable(stopInstanceBeforeDetaching);
            return this;
        }

        public Builder setVolumeId(@Nullable Input<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public Builder setVolumeId(@Nullable String volumeId) {
            this.volumeId = Input.ofNullable(volumeId);
            return this;
        }
        public VolumeAttachmentState build() {
            return new VolumeAttachmentState(deviceName, forceDetach, instanceId, skipDestroy, stopInstanceBeforeDetaching, volumeId);
        }
    }
}
