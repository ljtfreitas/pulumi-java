// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies the logging behavior for transfer operations. For cloud-to-cloud transfers, logs are sent to Cloud Logging. See [Read transfer logs](https://cloud.google.com/storage-transfer/docs/read-transfer-logs) for details. For transfers to or from a POSIX file system, logs are stored in the Cloud Storage bucket that is the source or sink of the transfer. See [Managing Transfer for on-premises jobs] (https://cloud.google.com/storage-transfer/docs/managing-on-prem-jobs#viewing-logs) for details.
 * 
 */
public final class LoggingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoggingConfigResponse Empty = new LoggingConfigResponse();

    /**
     * For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
     * 
     */
    @Import(name="enableOnpremGcsTransferLogs", required=true)
      private final Boolean enableOnpremGcsTransferLogs;

    public Boolean getEnableOnpremGcsTransferLogs() {
        return this.enableOnpremGcsTransferLogs;
    }

    /**
     * States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    @Import(name="logActionStates", required=true)
      private final List<String> logActionStates;

    public List<String> getLogActionStates() {
        return this.logActionStates;
    }

    /**
     * Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    @Import(name="logActions", required=true)
      private final List<String> logActions;

    public List<String> getLogActions() {
        return this.logActions;
    }

    public LoggingConfigResponse(
        Boolean enableOnpremGcsTransferLogs,
        List<String> logActionStates,
        List<String> logActions) {
        this.enableOnpremGcsTransferLogs = Objects.requireNonNull(enableOnpremGcsTransferLogs, "expected parameter 'enableOnpremGcsTransferLogs' to be non-null");
        this.logActionStates = Objects.requireNonNull(logActionStates, "expected parameter 'logActionStates' to be non-null");
        this.logActions = Objects.requireNonNull(logActions, "expected parameter 'logActions' to be non-null");
    }

    private LoggingConfigResponse() {
        this.enableOnpremGcsTransferLogs = null;
        this.logActionStates = List.of();
        this.logActions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableOnpremGcsTransferLogs;
        private List<String> logActionStates;
        private List<String> logActions;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableOnpremGcsTransferLogs = defaults.enableOnpremGcsTransferLogs;
    	      this.logActionStates = defaults.logActionStates;
    	      this.logActions = defaults.logActions;
        }

        public Builder enableOnpremGcsTransferLogs(Boolean enableOnpremGcsTransferLogs) {
            this.enableOnpremGcsTransferLogs = Objects.requireNonNull(enableOnpremGcsTransferLogs);
            return this;
        }

        public Builder logActionStates(List<String> logActionStates) {
            this.logActionStates = Objects.requireNonNull(logActionStates);
            return this;
        }

        public Builder logActions(List<String> logActions) {
            this.logActions = Objects.requireNonNull(logActions);
            return this;
        }
        public LoggingConfigResponse build() {
            return new LoggingConfigResponse(enableOnpremGcsTransferLogs, logActionStates, logActions);
        }
    }
}
