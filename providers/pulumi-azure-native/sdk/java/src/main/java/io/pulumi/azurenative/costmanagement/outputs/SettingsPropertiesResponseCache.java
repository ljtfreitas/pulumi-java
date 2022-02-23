// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SettingsPropertiesResponseCache {
    /**
     * Indicates the account type. Allowed values include: EA, PAYG, Modern, Internal, Unknown.
     * 
     */
    private final String channel;
    /**
     * Resource ID used by Resource Manager to uniquely identify the scope.
     * 
     */
    private final String id;
    /**
     * Display name for the scope.
     * 
     */
    private final String name;
    /**
     * Resource ID of the parent scope. For instance, subscription's resource ID for a resource group or a management group resource ID for a subscription.
     * 
     */
    private final @Nullable String parent;
    /**
     * Indicates the status of the scope. Status only applies to subscriptions and billing accounts.
     * 
     */
    private final @Nullable String status;
    /**
     * Indicates the type of modern account. Allowed values include: Individual, Enterprise, Partner, Indirect, NotApplicable
     * 
     */
    private final String subchannel;

    @OutputCustomType.Constructor({"channel","id","name","parent","status","subchannel"})
    private SettingsPropertiesResponseCache(
        String channel,
        String id,
        String name,
        @Nullable String parent,
        @Nullable String status,
        String subchannel) {
        this.channel = Objects.requireNonNull(channel);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.parent = parent;
        this.status = status;
        this.subchannel = Objects.requireNonNull(subchannel);
    }

    /**
     * Indicates the account type. Allowed values include: EA, PAYG, Modern, Internal, Unknown.
     * 
     */
    public String getChannel() {
        return this.channel;
    }
    /**
     * Resource ID used by Resource Manager to uniquely identify the scope.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Display name for the scope.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Resource ID of the parent scope. For instance, subscription's resource ID for a resource group or a management group resource ID for a subscription.
     * 
     */
    public Optional<String> getParent() {
        return Optional.ofNullable(this.parent);
    }
    /**
     * Indicates the status of the scope. Status only applies to subscriptions and billing accounts.
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Indicates the type of modern account. Allowed values include: Individual, Enterprise, Partner, Indirect, NotApplicable
     * 
     */
    public String getSubchannel() {
        return this.subchannel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsPropertiesResponseCache defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channel;
        private String id;
        private String name;
        private @Nullable String parent;
        private @Nullable String status;
        private String subchannel;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsPropertiesResponseCache defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.status = defaults.status;
    	      this.subchannel = defaults.subchannel;
        }

        public Builder setChannel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = parent;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSubchannel(String subchannel) {
            this.subchannel = Objects.requireNonNull(subchannel);
            return this;
        }
        public SettingsPropertiesResponseCache build() {
            return new SettingsPropertiesResponseCache(channel, id, name, parent, status, subchannel);
        }
    }
}
