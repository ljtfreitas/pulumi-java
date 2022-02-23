// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.KeyToPath;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigMapProjection {
    /**
     * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
     */
    private final @Nullable List<KeyToPath> items;
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    private final @Nullable String name;
    /**
     * Specify whether the ConfigMap or its keys must be defined
     * 
     */
    private final @Nullable Boolean optional;

    @OutputCustomType.Constructor({"items","name","optional"})
    private ConfigMapProjection(
        @Nullable List<KeyToPath> items,
        @Nullable String name,
        @Nullable Boolean optional) {
        this.items = items;
        this.name = name;
        this.optional = optional;
    }

    /**
     * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
     */
    public List<KeyToPath> getItems() {
        return this.items == null ? List.of() : this.items;
    }
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Specify whether the ConfigMap or its keys must be defined
     * 
     */
    public Optional<Boolean> getOptional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapProjection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<KeyToPath> items;
        private @Nullable String name;
        private @Nullable Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapProjection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder setItems(@Nullable List<KeyToPath> items) {
            this.items = items;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOptional(@Nullable Boolean optional) {
            this.optional = optional;
            return this;
        }
        public ConfigMapProjection build() {
            return new ConfigMapProjection(items, name, optional);
        }
    }
}
