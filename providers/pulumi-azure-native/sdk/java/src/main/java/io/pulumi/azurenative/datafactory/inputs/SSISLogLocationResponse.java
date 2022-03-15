// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SSISAccessCredentialResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSIS package execution log location
 * 
 */
public final class SSISLogLocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SSISLogLocationResponse Empty = new SSISLogLocationResponse();

    /**
     * The package execution log access credential.
     * 
     */
    @Import(name="accessCredential")
      private final @Nullable SSISAccessCredentialResponse accessCredential;

    public Optional<SSISAccessCredentialResponse> getAccessCredential() {
        return this.accessCredential == null ? Optional.empty() : Optional.ofNullable(this.accessCredential);
    }

    /**
     * The SSIS package execution log path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="logPath", required=true)
      private final Object logPath;

    public Object getLogPath() {
        return this.logPath;
    }

    /**
     * Specifies the interval to refresh log. The default interval is 5 minutes. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="logRefreshInterval")
      private final @Nullable Object logRefreshInterval;

    public Optional<Object> getLogRefreshInterval() {
        return this.logRefreshInterval == null ? Optional.empty() : Optional.ofNullable(this.logRefreshInterval);
    }

    /**
     * The type of SSIS log location.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public SSISLogLocationResponse(
        @Nullable SSISAccessCredentialResponse accessCredential,
        Object logPath,
        @Nullable Object logRefreshInterval,
        String type) {
        this.accessCredential = accessCredential;
        this.logPath = Objects.requireNonNull(logPath, "expected parameter 'logPath' to be non-null");
        this.logRefreshInterval = logRefreshInterval;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SSISLogLocationResponse() {
        this.accessCredential = null;
        this.logPath = null;
        this.logRefreshInterval = null;
        this.type = null;
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

        public Builder accessCredential(@Nullable SSISAccessCredentialResponse accessCredential) {
            this.accessCredential = accessCredential;
            return this;
        }

        public Builder logPath(Object logPath) {
            this.logPath = Objects.requireNonNull(logPath);
            return this;
        }

        public Builder logRefreshInterval(@Nullable Object logRefreshInterval) {
            this.logRefreshInterval = logRefreshInterval;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SSISLogLocationResponse build() {
            return new SSISLogLocationResponse(accessCredential, logPath, logRefreshInterval, type);
        }
    }
}
