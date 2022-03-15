// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRunOpV2VolumeMountResponse {
    /**
     * Path within the container at which the volume should be mounted. Must not contain ':'. For Cloud SQL volumes, it can be left empty, or must otherwise be `/cloudsql`. All instances defined in the Volume will be available as `/cloudsql/[instance]`. For more information on Cloud SQL volumes, visit https://cloud.google.com/sql/docs/mysql/connect-run
     * 
     */
    private final String mountPath;
    /**
     * This must match the Name of a Volume.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GoogleCloudRunOpV2VolumeMountResponse(
        @CustomType.Parameter("mountPath") String mountPath,
        @CustomType.Parameter("name") String name) {
        this.mountPath = mountPath;
        this.name = name;
    }

    /**
     * Path within the container at which the volume should be mounted. Must not contain ':'. For Cloud SQL volumes, it can be left empty, or must otherwise be `/cloudsql`. All instances defined in the Volume will be available as `/cloudsql/[instance]`. For more information on Cloud SQL volumes, visit https://cloud.google.com/sql/docs/mysql/connect-run
     * 
    */
    public String getMountPath() {
        return this.mountPath;
    }
    /**
     * This must match the Name of a Volume.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2VolumeMountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2VolumeMountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
        }

        public Builder mountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GoogleCloudRunOpV2VolumeMountResponse build() {
            return new GoogleCloudRunOpV2VolumeMountResponse(mountPath, name);
        }
    }
}
