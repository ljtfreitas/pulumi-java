// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.aws.fsx.outputs.OntapStorageVirtualMachineEndpointIscse;
import io.pulumi.aws.fsx.outputs.OntapStorageVirtualMachineEndpointManagement;
import io.pulumi.aws.fsx.outputs.OntapStorageVirtualMachineEndpointNf;
import io.pulumi.aws.fsx.outputs.OntapStorageVirtualMachineEndpointSmb;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class OntapStorageVirtualMachineEndpoint {
    /**
     * An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
     * 
     */
    private final @Nullable List<OntapStorageVirtualMachineEndpointIscse> iscses;
    /**
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * 
     */
    private final @Nullable List<OntapStorageVirtualMachineEndpointManagement> managements;
    /**
     * An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
     * 
     */
    private final @Nullable List<OntapStorageVirtualMachineEndpointNf> nfs;
    /**
     * An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an active_directory_configuration has been set. See Endpoint.
     * 
     */
    private final @Nullable List<OntapStorageVirtualMachineEndpointSmb> smbs;

    @OutputCustomType.Constructor({"iscses","managements","nfs","smbs"})
    private OntapStorageVirtualMachineEndpoint(
        @Nullable List<OntapStorageVirtualMachineEndpointIscse> iscses,
        @Nullable List<OntapStorageVirtualMachineEndpointManagement> managements,
        @Nullable List<OntapStorageVirtualMachineEndpointNf> nfs,
        @Nullable List<OntapStorageVirtualMachineEndpointSmb> smbs) {
        this.iscses = iscses;
        this.managements = managements;
        this.nfs = nfs;
        this.smbs = smbs;
    }

    /**
     * An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
     * 
     */
    public List<OntapStorageVirtualMachineEndpointIscse> getIscses() {
        return this.iscses == null ? List.of() : this.iscses;
    }
    /**
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * 
     */
    public List<OntapStorageVirtualMachineEndpointManagement> getManagements() {
        return this.managements == null ? List.of() : this.managements;
    }
    /**
     * An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
     * 
     */
    public List<OntapStorageVirtualMachineEndpointNf> getNfs() {
        return this.nfs == null ? List.of() : this.nfs;
    }
    /**
     * An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an active_directory_configuration has been set. See Endpoint.
     * 
     */
    public List<OntapStorageVirtualMachineEndpointSmb> getSmbs() {
        return this.smbs == null ? List.of() : this.smbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapStorageVirtualMachineEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OntapStorageVirtualMachineEndpointIscse> iscses;
        private @Nullable List<OntapStorageVirtualMachineEndpointManagement> managements;
        private @Nullable List<OntapStorageVirtualMachineEndpointNf> nfs;
        private @Nullable List<OntapStorageVirtualMachineEndpointSmb> smbs;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapStorageVirtualMachineEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iscses = defaults.iscses;
    	      this.managements = defaults.managements;
    	      this.nfs = defaults.nfs;
    	      this.smbs = defaults.smbs;
        }

        public Builder setIscses(@Nullable List<OntapStorageVirtualMachineEndpointIscse> iscses) {
            this.iscses = iscses;
            return this;
        }

        public Builder setManagements(@Nullable List<OntapStorageVirtualMachineEndpointManagement> managements) {
            this.managements = managements;
            return this;
        }

        public Builder setNfs(@Nullable List<OntapStorageVirtualMachineEndpointNf> nfs) {
            this.nfs = nfs;
            return this;
        }

        public Builder setSmbs(@Nullable List<OntapStorageVirtualMachineEndpointSmb> smbs) {
            this.smbs = smbs;
            return this;
        }
        public OntapStorageVirtualMachineEndpoint build() {
            return new OntapStorageVirtualMachineEndpoint(iscses, managements, nfs, smbs);
        }
    }
}
