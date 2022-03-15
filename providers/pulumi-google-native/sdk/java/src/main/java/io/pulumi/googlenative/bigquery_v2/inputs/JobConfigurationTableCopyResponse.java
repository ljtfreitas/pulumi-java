// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquery_v2.inputs.EncryptionConfigurationResponse;
import io.pulumi.googlenative.bigquery_v2.inputs.TableReferenceResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class JobConfigurationTableCopyResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobConfigurationTableCopyResponse Empty = new JobConfigurationTableCopyResponse();

    /**
     * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @Import(name="createDisposition", required=true)
      private final String createDisposition;

    public String getCreateDisposition() {
        return this.createDisposition;
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    @Import(name="destinationEncryptionConfiguration", required=true)
      private final EncryptionConfigurationResponse destinationEncryptionConfiguration;

    public EncryptionConfigurationResponse getDestinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration;
    }

    /**
     * [Optional] The time when the destination table expires. Expired tables will be deleted and their storage reclaimed.
     * 
     */
    @Import(name="destinationExpirationTime", required=true)
      private final Object destinationExpirationTime;

    public Object getDestinationExpirationTime() {
        return this.destinationExpirationTime;
    }

    /**
     * [Required] The destination table
     * 
     */
    @Import(name="destinationTable", required=true)
      private final TableReferenceResponse destinationTable;

    public TableReferenceResponse getDestinationTable() {
        return this.destinationTable;
    }

    /**
     * [Optional] Supported operation types in table copy job.
     * 
     */
    @Import(name="operationType", required=true)
      private final String operationType;

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * [Pick one] Source table to copy.
     * 
     */
    @Import(name="sourceTable", required=true)
      private final TableReferenceResponse sourceTable;

    public TableReferenceResponse getSourceTable() {
        return this.sourceTable;
    }

    /**
     * [Pick one] Source tables to copy.
     * 
     */
    @Import(name="sourceTables", required=true)
      private final List<TableReferenceResponse> sourceTables;

    public List<TableReferenceResponse> getSourceTables() {
        return this.sourceTables;
    }

    /**
     * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @Import(name="writeDisposition", required=true)
      private final String writeDisposition;

    public String getWriteDisposition() {
        return this.writeDisposition;
    }

    public JobConfigurationTableCopyResponse(
        String createDisposition,
        EncryptionConfigurationResponse destinationEncryptionConfiguration,
        Object destinationExpirationTime,
        TableReferenceResponse destinationTable,
        String operationType,
        TableReferenceResponse sourceTable,
        List<TableReferenceResponse> sourceTables,
        String writeDisposition) {
        this.createDisposition = Objects.requireNonNull(createDisposition, "expected parameter 'createDisposition' to be non-null");
        this.destinationEncryptionConfiguration = Objects.requireNonNull(destinationEncryptionConfiguration, "expected parameter 'destinationEncryptionConfiguration' to be non-null");
        this.destinationExpirationTime = Objects.requireNonNull(destinationExpirationTime, "expected parameter 'destinationExpirationTime' to be non-null");
        this.destinationTable = Objects.requireNonNull(destinationTable, "expected parameter 'destinationTable' to be non-null");
        this.operationType = Objects.requireNonNull(operationType, "expected parameter 'operationType' to be non-null");
        this.sourceTable = Objects.requireNonNull(sourceTable, "expected parameter 'sourceTable' to be non-null");
        this.sourceTables = Objects.requireNonNull(sourceTables, "expected parameter 'sourceTables' to be non-null");
        this.writeDisposition = Objects.requireNonNull(writeDisposition, "expected parameter 'writeDisposition' to be non-null");
    }

    private JobConfigurationTableCopyResponse() {
        this.createDisposition = null;
        this.destinationEncryptionConfiguration = null;
        this.destinationExpirationTime = null;
        this.destinationTable = null;
        this.operationType = null;
        this.sourceTable = null;
        this.sourceTables = List.of();
        this.writeDisposition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationTableCopyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createDisposition;
        private EncryptionConfigurationResponse destinationEncryptionConfiguration;
        private Object destinationExpirationTime;
        private TableReferenceResponse destinationTable;
        private String operationType;
        private TableReferenceResponse sourceTable;
        private List<TableReferenceResponse> sourceTables;
        private String writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationTableCopyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createDisposition = defaults.createDisposition;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationExpirationTime = defaults.destinationExpirationTime;
    	      this.destinationTable = defaults.destinationTable;
    	      this.operationType = defaults.operationType;
    	      this.sourceTable = defaults.sourceTable;
    	      this.sourceTables = defaults.sourceTables;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder createDisposition(String createDisposition) {
            this.createDisposition = Objects.requireNonNull(createDisposition);
            return this;
        }

        public Builder destinationEncryptionConfiguration(EncryptionConfigurationResponse destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Objects.requireNonNull(destinationEncryptionConfiguration);
            return this;
        }

        public Builder destinationExpirationTime(Object destinationExpirationTime) {
            this.destinationExpirationTime = Objects.requireNonNull(destinationExpirationTime);
            return this;
        }

        public Builder destinationTable(TableReferenceResponse destinationTable) {
            this.destinationTable = Objects.requireNonNull(destinationTable);
            return this;
        }

        public Builder operationType(String operationType) {
            this.operationType = Objects.requireNonNull(operationType);
            return this;
        }

        public Builder sourceTable(TableReferenceResponse sourceTable) {
            this.sourceTable = Objects.requireNonNull(sourceTable);
            return this;
        }

        public Builder sourceTables(List<TableReferenceResponse> sourceTables) {
            this.sourceTables = Objects.requireNonNull(sourceTables);
            return this;
        }

        public Builder writeDisposition(String writeDisposition) {
            this.writeDisposition = Objects.requireNonNull(writeDisposition);
            return this;
        }
        public JobConfigurationTableCopyResponse build() {
            return new JobConfigurationTableCopyResponse(createDisposition, destinationEncryptionConfiguration, destinationExpirationTime, destinationTable, operationType, sourceTable, sourceTables, writeDisposition);
        }
    }
}
