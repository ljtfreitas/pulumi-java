// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.file_v1.outputs.NfsExportOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FileShareConfigResponse {
    /**
     * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes.
     * 
     */
    private final String capacityGb;
    /**
     * The name of the file share (must be 16 characters or less).
     * 
     */
    private final String name;
    /**
     * Nfs Export Options. There is a limit of 10 export options per file share.
     * 
     */
    private final List<NfsExportOptionsResponse> nfsExportOptions;
    /**
     * The resource name of the backup, in the format `projects/{project_number}/locations/{location_id}/backups/{backup_id}`, that this file share has been restored from.
     * 
     */
    private final String sourceBackup;

    @CustomType.Constructor
    private FileShareConfigResponse(
        @CustomType.Parameter("capacityGb") String capacityGb,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nfsExportOptions") List<NfsExportOptionsResponse> nfsExportOptions,
        @CustomType.Parameter("sourceBackup") String sourceBackup) {
        this.capacityGb = capacityGb;
        this.name = name;
        this.nfsExportOptions = nfsExportOptions;
        this.sourceBackup = sourceBackup;
    }

    /**
     * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes.
     * 
    */
    public String getCapacityGb() {
        return this.capacityGb;
    }
    /**
     * The name of the file share (must be 16 characters or less).
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Nfs Export Options. There is a limit of 10 export options per file share.
     * 
    */
    public List<NfsExportOptionsResponse> getNfsExportOptions() {
        return this.nfsExportOptions;
    }
    /**
     * The resource name of the backup, in the format `projects/{project_number}/locations/{location_id}/backups/{backup_id}`, that this file share has been restored from.
     * 
    */
    public String getSourceBackup() {
        return this.sourceBackup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileShareConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String capacityGb;
        private String name;
        private List<NfsExportOptionsResponse> nfsExportOptions;
        private String sourceBackup;

        public Builder() {
    	      // Empty
        }

        public Builder(FileShareConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityGb = defaults.capacityGb;
    	      this.name = defaults.name;
    	      this.nfsExportOptions = defaults.nfsExportOptions;
    	      this.sourceBackup = defaults.sourceBackup;
        }

        public Builder capacityGb(String capacityGb) {
            this.capacityGb = Objects.requireNonNull(capacityGb);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder nfsExportOptions(List<NfsExportOptionsResponse> nfsExportOptions) {
            this.nfsExportOptions = Objects.requireNonNull(nfsExportOptions);
            return this;
        }

        public Builder sourceBackup(String sourceBackup) {
            this.sourceBackup = Objects.requireNonNull(sourceBackup);
            return this;
        }
        public FileShareConfigResponse build() {
            return new FileShareConfigResponse(capacityGb, name, nfsExportOptions, sourceBackup);
        }
    }
}
