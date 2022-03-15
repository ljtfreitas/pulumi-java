// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.enums.AssetPropertyNotificationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The asset property's definition, alias, and notification state.
 * 
 */
public final class AssetPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetPropertyArgs Empty = new AssetPropertyArgs();

    /**
     * The property alias that identifies the property.
     * 
     */
    @Import(name="alias")
      private final @Nullable Output<String> alias;

    public Output<String> getAlias() {
        return this.alias == null ? Output.empty() : this.alias;
    }

    /**
     * Customer provided ID for property.
     * 
     */
    @Import(name="logicalId", required=true)
      private final Output<String> logicalId;

    public Output<String> getLogicalId() {
        return this.logicalId;
    }

    /**
     * The MQTT notification state (ENABLED or DISABLED) for this asset property.
     * 
     */
    @Import(name="notificationState")
      private final @Nullable Output<AssetPropertyNotificationState> notificationState;

    public Output<AssetPropertyNotificationState> getNotificationState() {
        return this.notificationState == null ? Output.empty() : this.notificationState;
    }

    public AssetPropertyArgs(
        @Nullable Output<String> alias,
        Output<String> logicalId,
        @Nullable Output<AssetPropertyNotificationState> notificationState) {
        this.alias = alias;
        this.logicalId = Objects.requireNonNull(logicalId, "expected parameter 'logicalId' to be non-null");
        this.notificationState = notificationState;
    }

    private AssetPropertyArgs() {
        this.alias = Output.empty();
        this.logicalId = Output.empty();
        this.notificationState = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alias;
        private Output<String> logicalId;
        private @Nullable Output<AssetPropertyNotificationState> notificationState;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.logicalId = defaults.logicalId;
    	      this.notificationState = defaults.notificationState;
        }

        public Builder alias(@Nullable Output<String> alias) {
            this.alias = alias;
            return this;
        }

        public Builder alias(@Nullable String alias) {
            this.alias = Output.ofNullable(alias);
            return this;
        }

        public Builder logicalId(Output<String> logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }

        public Builder logicalId(String logicalId) {
            this.logicalId = Output.of(Objects.requireNonNull(logicalId));
            return this;
        }

        public Builder notificationState(@Nullable Output<AssetPropertyNotificationState> notificationState) {
            this.notificationState = notificationState;
            return this;
        }

        public Builder notificationState(@Nullable AssetPropertyNotificationState notificationState) {
            this.notificationState = Output.ofNullable(notificationState);
            return this;
        }
        public AssetPropertyArgs build() {
            return new AssetPropertyArgs(alias, logicalId, notificationState);
        }
    }
}
