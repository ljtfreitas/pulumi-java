// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListWebAppHybridConnectionKeysResult {
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * The name of the send key.
     * 
     */
    private final String sendKeyName;
    /**
     * The value of the send key.
     * 
     */
    private final String sendKeyValue;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","kind","name","sendKeyName","sendKeyValue","type"})
    private ListWebAppHybridConnectionKeysResult(
        String id,
        @Nullable String kind,
        String name,
        String sendKeyName,
        String sendKeyValue,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.sendKeyName = Objects.requireNonNull(sendKeyName);
        this.sendKeyValue = Objects.requireNonNull(sendKeyValue);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The name of the send key.
     * 
     */
    public String getSendKeyName() {
        return this.sendKeyName;
    }
    /**
     * The value of the send key.
     * 
     */
    public String getSendKeyValue() {
        return this.sendKeyValue;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppHybridConnectionKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private String sendKeyName;
        private String sendKeyValue;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppHybridConnectionKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.sendKeyName = defaults.sendKeyName;
    	      this.sendKeyValue = defaults.sendKeyValue;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSendKeyName(String sendKeyName) {
            this.sendKeyName = Objects.requireNonNull(sendKeyName);
            return this;
        }

        public Builder setSendKeyValue(String sendKeyValue) {
            this.sendKeyValue = Objects.requireNonNull(sendKeyValue);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ListWebAppHybridConnectionKeysResult build() {
            return new ListWebAppHybridConnectionKeysResult(id, kind, name, sendKeyName, sendKeyValue, type);
        }
    }
}
