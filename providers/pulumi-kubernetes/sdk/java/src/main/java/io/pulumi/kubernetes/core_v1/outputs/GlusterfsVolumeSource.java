// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlusterfsVolumeSource {
    /**
     * EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    private final String endpoints;
    /**
     * Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    private final String path;
    /**
     * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    private final @Nullable Boolean readOnly;

    @OutputCustomType.Constructor({"endpoints","path","readOnly"})
    private GlusterfsVolumeSource(
        String endpoints,
        String path,
        @Nullable Boolean readOnly) {
        this.endpoints = Objects.requireNonNull(endpoints);
        this.path = Objects.requireNonNull(path);
        this.readOnly = readOnly;
    }

    /**
     * EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public String getEndpoints() {
        return this.endpoints;
    }
    /**
     * Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public String getPath() {
        return this.path;
    }
    /**
     * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlusterfsVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoints;
        private String path;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GlusterfsVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setEndpoints(String endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public GlusterfsVolumeSource build() {
            return new GlusterfsVolumeSource(endpoints, path, readOnly);
        }
    }
}
