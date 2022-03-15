// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.BackupItemResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListWebAppSiteBackupsSlotResult {
    /**
     * Link to next page of resources.
     * 
     */
    private final String nextLink;
    /**
     * Collection of resources.
     * 
     */
    private final List<BackupItemResponse> value;

    @CustomType.Constructor
    private ListWebAppSiteBackupsSlotResult(
        @CustomType.Parameter("nextLink") String nextLink,
        @CustomType.Parameter("value") List<BackupItemResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link to next page of resources.
     * 
    */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * Collection of resources.
     * 
    */
    public List<BackupItemResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppSiteBackupsSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private List<BackupItemResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppSiteBackupsSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder value(List<BackupItemResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListWebAppSiteBackupsSlotResult build() {
            return new ListWebAppSiteBackupsSlotResult(nextLink, value);
        }
    }
}
