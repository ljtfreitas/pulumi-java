// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudiot_v1.outputs.DeviceConfigResponse;
import io.pulumi.googlenative.cloudiot_v1.outputs.DeviceCredentialResponse;
import io.pulumi.googlenative.cloudiot_v1.outputs.DeviceStateResponse;
import io.pulumi.googlenative.cloudiot_v1.outputs.GatewayConfigResponse;
import io.pulumi.googlenative.cloudiot_v1.outputs.StatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetDeviceResult {
    private final Boolean blocked;
    private final DeviceConfigResponse config;
    private final List<DeviceCredentialResponse> credentials;
    private final GatewayConfigResponse gatewayConfig;
    private final String lastConfigAckTime;
    private final String lastConfigSendTime;
    private final StatusResponse lastErrorStatus;
    private final String lastErrorTime;
    private final String lastEventTime;
    private final String lastHeartbeatTime;
    private final String lastStateTime;
    private final String logLevel;
    private final Map<String,String> metadata;
    private final String name;
    private final String numId;
    private final DeviceStateResponse state;

    @OutputCustomType.Constructor({"blocked","config","credentials","gatewayConfig","lastConfigAckTime","lastConfigSendTime","lastErrorStatus","lastErrorTime","lastEventTime","lastHeartbeatTime","lastStateTime","logLevel","metadata","name","numId","state"})
    private GetDeviceResult(
        Boolean blocked,
        DeviceConfigResponse config,
        List<DeviceCredentialResponse> credentials,
        GatewayConfigResponse gatewayConfig,
        String lastConfigAckTime,
        String lastConfigSendTime,
        StatusResponse lastErrorStatus,
        String lastErrorTime,
        String lastEventTime,
        String lastHeartbeatTime,
        String lastStateTime,
        String logLevel,
        Map<String,String> metadata,
        String name,
        String numId,
        DeviceStateResponse state) {
        this.blocked = Objects.requireNonNull(blocked);
        this.config = Objects.requireNonNull(config);
        this.credentials = Objects.requireNonNull(credentials);
        this.gatewayConfig = Objects.requireNonNull(gatewayConfig);
        this.lastConfigAckTime = Objects.requireNonNull(lastConfigAckTime);
        this.lastConfigSendTime = Objects.requireNonNull(lastConfigSendTime);
        this.lastErrorStatus = Objects.requireNonNull(lastErrorStatus);
        this.lastErrorTime = Objects.requireNonNull(lastErrorTime);
        this.lastEventTime = Objects.requireNonNull(lastEventTime);
        this.lastHeartbeatTime = Objects.requireNonNull(lastHeartbeatTime);
        this.lastStateTime = Objects.requireNonNull(lastStateTime);
        this.logLevel = Objects.requireNonNull(logLevel);
        this.metadata = Objects.requireNonNull(metadata);
        this.name = Objects.requireNonNull(name);
        this.numId = Objects.requireNonNull(numId);
        this.state = Objects.requireNonNull(state);
    }

    public Boolean getBlocked() {
        return this.blocked;
    }
    public DeviceConfigResponse getConfig() {
        return this.config;
    }
    public List<DeviceCredentialResponse> getCredentials() {
        return this.credentials;
    }
    public GatewayConfigResponse getGatewayConfig() {
        return this.gatewayConfig;
    }
    public String getLastConfigAckTime() {
        return this.lastConfigAckTime;
    }
    public String getLastConfigSendTime() {
        return this.lastConfigSendTime;
    }
    public StatusResponse getLastErrorStatus() {
        return this.lastErrorStatus;
    }
    public String getLastErrorTime() {
        return this.lastErrorTime;
    }
    public String getLastEventTime() {
        return this.lastEventTime;
    }
    public String getLastHeartbeatTime() {
        return this.lastHeartbeatTime;
    }
    public String getLastStateTime() {
        return this.lastStateTime;
    }
    public String getLogLevel() {
        return this.logLevel;
    }
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    public String getName() {
        return this.name;
    }
    public String getNumId() {
        return this.numId;
    }
    public DeviceStateResponse getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean blocked;
        private DeviceConfigResponse config;
        private List<DeviceCredentialResponse> credentials;
        private GatewayConfigResponse gatewayConfig;
        private String lastConfigAckTime;
        private String lastConfigSendTime;
        private StatusResponse lastErrorStatus;
        private String lastErrorTime;
        private String lastEventTime;
        private String lastHeartbeatTime;
        private String lastStateTime;
        private String logLevel;
        private Map<String,String> metadata;
        private String name;
        private String numId;
        private DeviceStateResponse state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blocked = defaults.blocked;
    	      this.config = defaults.config;
    	      this.credentials = defaults.credentials;
    	      this.gatewayConfig = defaults.gatewayConfig;
    	      this.lastConfigAckTime = defaults.lastConfigAckTime;
    	      this.lastConfigSendTime = defaults.lastConfigSendTime;
    	      this.lastErrorStatus = defaults.lastErrorStatus;
    	      this.lastErrorTime = defaults.lastErrorTime;
    	      this.lastEventTime = defaults.lastEventTime;
    	      this.lastHeartbeatTime = defaults.lastHeartbeatTime;
    	      this.lastStateTime = defaults.lastStateTime;
    	      this.logLevel = defaults.logLevel;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.numId = defaults.numId;
    	      this.state = defaults.state;
        }

        public Builder setBlocked(Boolean blocked) {
            this.blocked = Objects.requireNonNull(blocked);
            return this;
        }

        public Builder setConfig(DeviceConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setCredentials(List<DeviceCredentialResponse> credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }

        public Builder setGatewayConfig(GatewayConfigResponse gatewayConfig) {
            this.gatewayConfig = Objects.requireNonNull(gatewayConfig);
            return this;
        }

        public Builder setLastConfigAckTime(String lastConfigAckTime) {
            this.lastConfigAckTime = Objects.requireNonNull(lastConfigAckTime);
            return this;
        }

        public Builder setLastConfigSendTime(String lastConfigSendTime) {
            this.lastConfigSendTime = Objects.requireNonNull(lastConfigSendTime);
            return this;
        }

        public Builder setLastErrorStatus(StatusResponse lastErrorStatus) {
            this.lastErrorStatus = Objects.requireNonNull(lastErrorStatus);
            return this;
        }

        public Builder setLastErrorTime(String lastErrorTime) {
            this.lastErrorTime = Objects.requireNonNull(lastErrorTime);
            return this;
        }

        public Builder setLastEventTime(String lastEventTime) {
            this.lastEventTime = Objects.requireNonNull(lastEventTime);
            return this;
        }

        public Builder setLastHeartbeatTime(String lastHeartbeatTime) {
            this.lastHeartbeatTime = Objects.requireNonNull(lastHeartbeatTime);
            return this;
        }

        public Builder setLastStateTime(String lastStateTime) {
            this.lastStateTime = Objects.requireNonNull(lastStateTime);
            return this;
        }

        public Builder setLogLevel(String logLevel) {
            this.logLevel = Objects.requireNonNull(logLevel);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNumId(String numId) {
            this.numId = Objects.requireNonNull(numId);
            return this;
        }

        public Builder setState(DeviceStateResponse state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public GetDeviceResult build() {
            return new GetDeviceResult(blocked, config, credentials, gatewayConfig, lastConfigAckTime, lastConfigSendTime, lastErrorStatus, lastErrorTime, lastEventTime, lastHeartbeatTime, lastStateTime, logLevel, metadata, name, numId, state);
        }
    }
}