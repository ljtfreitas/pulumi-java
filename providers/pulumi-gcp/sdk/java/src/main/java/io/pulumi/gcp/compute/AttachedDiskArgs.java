// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttachedDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttachedDiskArgs Empty = new AttachedDiskArgs();

    /**
     * Specifies a unique device name of your choice that is
     * reflected into the /dev/disk/by-id/google-* tree of a Linux operating
     * system running within the instance. This name can be used to
     * reference the device for mounting, resizing, and so on, from within
     * the instance.
     * 
     */
    @InputImport(name="deviceName")
        private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * `name` or `self_link` of the disk that will be attached.
     * 
     */
    @InputImport(name="disk", required=true)
        private final Input<String> disk;

    public Input<String> getDisk() {
        return this.disk;
    }

    /**
     * `name` or `self_link` of the compute instance that the disk will be attached to.
     * If the `self_link` is provided then `zone` and `project` are extracted from the
     * self link. If only the name is used then `zone` and `project` must be defined
     * as properties on the resource or provider.
     * 
     */
    @InputImport(name="instance", required=true)
        private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE or
     * READ_ONLY. If not specified, the default is to attach the disk in
     * READ_WRITE mode.
     * 
     */
    @InputImport(name="mode")
        private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The project that the referenced compute instance is a part of. If `instance` is referenced by its
     * `self_link` the project defined in the link will take precedence.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The zone that the referenced compute instance is located within. If `instance` is referenced by its
     * `self_link` the zone defined in the link will take precedence.
     * 
     */
    @InputImport(name="zone")
        private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public AttachedDiskArgs(
        @Nullable Input<String> deviceName,
        Input<String> disk,
        Input<String> instance,
        @Nullable Input<String> mode,
        @Nullable Input<String> project,
        @Nullable Input<String> zone) {
        this.deviceName = deviceName;
        this.disk = Objects.requireNonNull(disk, "expected parameter 'disk' to be non-null");
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.mode = mode;
        this.project = project;
        this.zone = zone;
    }

    private AttachedDiskArgs() {
        this.deviceName = Input.empty();
        this.disk = Input.empty();
        this.instance = Input.empty();
        this.mode = Input.empty();
        this.project = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deviceName;
        private Input<String> disk;
        private Input<String> instance;
        private @Nullable Input<String> mode;
        private @Nullable Input<String> project;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.disk = defaults.disk;
    	      this.instance = defaults.instance;
    	      this.mode = defaults.mode;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setDisk(Input<String> disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }

        public Builder setDisk(String disk) {
            this.disk = Input.of(Objects.requireNonNull(disk));
            return this;
        }

        public Builder setInstance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
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

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public AttachedDiskArgs build() {
            return new AttachedDiskArgs(deviceName, disk, instance, mode, project, zone);
        }
    }
}
