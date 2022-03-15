// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.composer_v1beta1.outputs.SchedulerResourceResponse;
import io.pulumi.googlenative.composer_v1beta1.outputs.WebServerResourceResponse;
import io.pulumi.googlenative.composer_v1beta1.outputs.WorkerResourceResponse;
import java.util.Objects;

@CustomType
public final class WorkloadsConfigResponse {
    /**
     * Optional. Resources used by Airflow schedulers.
     * 
     */
    private final SchedulerResourceResponse scheduler;
    /**
     * Optional. Resources used by Airflow web server.
     * 
     */
    private final WebServerResourceResponse webServer;
    /**
     * Optional. Resources used by Airflow workers.
     * 
     */
    private final WorkerResourceResponse worker;

    @CustomType.Constructor
    private WorkloadsConfigResponse(
        @CustomType.Parameter("scheduler") SchedulerResourceResponse scheduler,
        @CustomType.Parameter("webServer") WebServerResourceResponse webServer,
        @CustomType.Parameter("worker") WorkerResourceResponse worker) {
        this.scheduler = scheduler;
        this.webServer = webServer;
        this.worker = worker;
    }

    /**
     * Optional. Resources used by Airflow schedulers.
     * 
    */
    public SchedulerResourceResponse getScheduler() {
        return this.scheduler;
    }
    /**
     * Optional. Resources used by Airflow web server.
     * 
    */
    public WebServerResourceResponse getWebServer() {
        return this.webServer;
    }
    /**
     * Optional. Resources used by Airflow workers.
     * 
    */
    public WorkerResourceResponse getWorker() {
        return this.worker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulerResourceResponse scheduler;
        private WebServerResourceResponse webServer;
        private WorkerResourceResponse worker;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduler = defaults.scheduler;
    	      this.webServer = defaults.webServer;
    	      this.worker = defaults.worker;
        }

        public Builder scheduler(SchedulerResourceResponse scheduler) {
            this.scheduler = Objects.requireNonNull(scheduler);
            return this;
        }

        public Builder webServer(WebServerResourceResponse webServer) {
            this.webServer = Objects.requireNonNull(webServer);
            return this;
        }

        public Builder worker(WorkerResourceResponse worker) {
            this.worker = Objects.requireNonNull(worker);
            return this;
        }
        public WorkloadsConfigResponse build() {
            return new WorkloadsConfigResponse(scheduler, webServer, worker);
        }
    }
}
