// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.SSISAccessCredentialResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SSISLogLocationResponse {
    /**
     * The package execution log access credential.
     * 
     */
    private final @Nullable SSISAccessCredentialResponse accessCredential;
    /**
     * The SSIS package execution log path. Type: string (or Expression with resultType string).
     * 
     */
    private final Object logPath;
    /**
     * Specifies the interval to refresh log. The default interval is 5 minutes. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object logRefreshInterval;
    /**
     * The type of SSIS log location.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"accessCredential","logPath","logRefreshInterval","type"})
    private SSISLogLocationResponse(
        @Nullable SSISAccessCredentialResponse accessCredential,
        Object logPath,
        @Nullable Object logRefreshInterval,
        String type) {
        this.accessCredential = accessCredential;
        this.logPath = Objects.requireNonNull(logPath);
        this.logRefreshInterval = logRefreshInterval;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The package execution log access credential.
     * 
     */
    public Optional<SSISAccessCredentialResponse> getAccessCredential() {
        return Optional.ofNullable(this.accessCredential);
    }
    /**
     * The SSIS package execution log path. Type: string (or Expression with resultType string).
     * 
     */
    public Object getLogPath() {
        return this.logPath;
    }
    /**
     * Specifies the interval to refresh log. The default interval is 5 minutes. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> getLogRefreshInterval() {
        return Optional.ofNullable(this.logRefreshInterval);
    }
    /**
     * The type of SSIS log location.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISLogLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SSISAccessCredentialResponse accessCredential;
        private Object logPath;
        private @Nullable Object logRefreshInterval;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISLogLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessCredential = defaults.accessCredential;
    	      this.logPath = defaults.logPath;
    	      this.logRefreshInterval = defaults.logRefreshInterval;
    	      this.type = defaults.type;
        }

        public Builder setAccessCredential(@Nullable SSISAccessCredentialResponse accessCredential) {
            this.accessCredential = accessCredential;
            return this;
        }

        public Builder setLogPath(Object logPath) {
            this.logPath = Objects.requireNonNull(logPath);
            return this;
        }

        public Builder setLogRefreshInterval(@Nullable Object logRefreshInterval) {
            this.logRefreshInterval = logRefreshInterval;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public SSISLogLocationResponse build() {
            return new SSISLogLocationResponse(accessCredential, logPath, logRefreshInterval, type);
        }
    }
}
