// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatastoreCustomerManagedS3;
import io.pulumi.awsnative.iotanalytics.inputs.DatastoreIotSiteWiseMultiLayerStorage;
import io.pulumi.awsnative.iotanalytics.inputs.DatastoreServiceManagedS3;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreStorage extends io.pulumi.resources.InvokeArgs {

    public static final DatastoreStorage Empty = new DatastoreStorage();

    @InputImport(name="customerManagedS3")
        private final @Nullable DatastoreCustomerManagedS3 customerManagedS3;

    public Optional<DatastoreCustomerManagedS3> getCustomerManagedS3() {
        return this.customerManagedS3 == null ? Optional.empty() : Optional.ofNullable(this.customerManagedS3);
    }

    @InputImport(name="iotSiteWiseMultiLayerStorage")
        private final @Nullable DatastoreIotSiteWiseMultiLayerStorage iotSiteWiseMultiLayerStorage;

    public Optional<DatastoreIotSiteWiseMultiLayerStorage> getIotSiteWiseMultiLayerStorage() {
        return this.iotSiteWiseMultiLayerStorage == null ? Optional.empty() : Optional.ofNullable(this.iotSiteWiseMultiLayerStorage);
    }

    @InputImport(name="serviceManagedS3")
        private final @Nullable DatastoreServiceManagedS3 serviceManagedS3;

    public Optional<DatastoreServiceManagedS3> getServiceManagedS3() {
        return this.serviceManagedS3 == null ? Optional.empty() : Optional.ofNullable(this.serviceManagedS3);
    }

    public DatastoreStorage(
        @Nullable DatastoreCustomerManagedS3 customerManagedS3,
        @Nullable DatastoreIotSiteWiseMultiLayerStorage iotSiteWiseMultiLayerStorage,
        @Nullable DatastoreServiceManagedS3 serviceManagedS3) {
        this.customerManagedS3 = customerManagedS3;
        this.iotSiteWiseMultiLayerStorage = iotSiteWiseMultiLayerStorage;
        this.serviceManagedS3 = serviceManagedS3;
    }

    private DatastoreStorage() {
        this.customerManagedS3 = null;
        this.iotSiteWiseMultiLayerStorage = null;
        this.serviceManagedS3 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreStorage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatastoreCustomerManagedS3 customerManagedS3;
        private @Nullable DatastoreIotSiteWiseMultiLayerStorage iotSiteWiseMultiLayerStorage;
        private @Nullable DatastoreServiceManagedS3 serviceManagedS3;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedS3 = defaults.customerManagedS3;
    	      this.iotSiteWiseMultiLayerStorage = defaults.iotSiteWiseMultiLayerStorage;
    	      this.serviceManagedS3 = defaults.serviceManagedS3;
        }

        public Builder setCustomerManagedS3(@Nullable DatastoreCustomerManagedS3 customerManagedS3) {
            this.customerManagedS3 = customerManagedS3;
            return this;
        }

        public Builder setIotSiteWiseMultiLayerStorage(@Nullable DatastoreIotSiteWiseMultiLayerStorage iotSiteWiseMultiLayerStorage) {
            this.iotSiteWiseMultiLayerStorage = iotSiteWiseMultiLayerStorage;
            return this;
        }

        public Builder setServiceManagedS3(@Nullable DatastoreServiceManagedS3 serviceManagedS3) {
            this.serviceManagedS3 = serviceManagedS3;
            return this;
        }
        public DatastoreStorage build() {
            return new DatastoreStorage(customerManagedS3, iotSiteWiseMultiLayerStorage, serviceManagedS3);
        }
    }
}
